/**
 * This class can be used to read sql files into an array of Strings, each
 * representing a single query terminated by ";"
 * Comments are filtered out.
 */
package com.project.controller;

import java.io.*;
import java.util.*;

/**
 * ATTENTION: SQL file must not contain column names, etc. including comment signs (#, --, /* etc.)
 * like e.g. a.'#rows' etc. because every characters after # or -- in a line are filtered
 * out of the query string the same is true for every characters surrounded by /* and
 */
public class GetDatabaseDDL {
  /**
   * Instantiates a new Get database dDL.
   *
   * @param path
   *     the path
   */
  public GetDatabaseDDL(final String path) {
    createQueries(path);

  }

  /**
   * Create queries.
   *
   * @param path
   *     Path to the SQL file
   *
   * @return List of query strings
   */
  ArrayList<String> createQueries(String path) {

    String queryLine;
    StringBuilder stringBuilder = new StringBuilder();
    final ArrayList<String> listOfQueries = new ArrayList<>();

    try {
      FileReader fileReader = new FileReader(new File(path));
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      //read the SQL file line by line
      while ((queryLine = bufferedReader.readLine()) != null) {
        // ignore comments beginning with #
        int indexOfCommentSign = queryLine.indexOf('#');
        if (indexOfCommentSign != -1) {
          if (queryLine.startsWith("#")) {
            queryLine = "";
          } else {
            queryLine = queryLine.substring(0, indexOfCommentSign - 1);
          }
        }
        // ignore comments beginning with --
        indexOfCommentSign = queryLine.indexOf("--");
        if (indexOfCommentSign != -1) {
          if (queryLine.startsWith("--")) {
            queryLine = "";
          } else {
            queryLine = queryLine.substring(0, indexOfCommentSign - 1);
          }
        }
        // ignore comments surrounded by /* */
        indexOfCommentSign = queryLine.indexOf("/*");
        if (indexOfCommentSign != -1) {
          if (queryLine.startsWith("#")) {
            queryLine = "";
          } else {
            queryLine = queryLine.substring(0, indexOfCommentSign - 1);
          }

          stringBuilder.append(queryLine).append(" ");
          // ignore all characters within the comment
          do {
            queryLine = bufferedReader.readLine();
          }
          while (queryLine != null && !queryLine.contains("*/"));
          indexOfCommentSign = queryLine.indexOf("*/");
          if (indexOfCommentSign != -1) {
            if (queryLine.endsWith("*/")) {
              queryLine = "";
            } else {
              queryLine = queryLine.substring(indexOfCommentSign + 2, queryLine.length() - 1);
            }
          }
        }

        //  the + " " is necessary, because otherwise the content before and after a line break
        // are concatenated
        // like e.g. a.xyz FROM becomes a.xyzFROM otherwise and can not be executed
        if (queryLine != null) {
          stringBuilder.append(queryLine).append(" ");
        }
      }
      bufferedReader.close();

      // here is our splitter ! We use ";" as a delimiter for each request
      String[] splittedQueries = stringBuilder.toString().split(";");

      // filter out empty statements
      for (final String splittedQuery : splittedQueries) {
        if (!splittedQuery.trim().equals("") && !splittedQuery.trim().equals("\t")) {
          listOfQueries.add(splittedQuery);
        }
      }
    } catch (Exception e) {
      System.out.println("*** Error : " + e.toString());
      System.out.println("*** ");
      System.out.println("*** Error : ");
      e.printStackTrace();
      System.out.println("################################################");
      System.out.println(stringBuilder.toString());
    }
    return listOfQueries;
  }
}