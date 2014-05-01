/**
 * This class can be used to read sql files into an array of Strings, each
 * representing a single query terminated by ";"
 * Comments are filtered out.
 */
package com.project.controller;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * ATTENTION: SQL file must not contain column names, etc. including comment signs (#, --, /* etc.)
 * like e.g. a.'#rows' etc. because every characters after # or -- in a line are filtered
 * out of the query string the same is true for every characters surrounded by /* and
 */
public class GetDatabaseDDL {
  private static final char POUNDSIGN = '#';
  private static final Pattern COMPILE = Pattern.compile(";");

  /**
   * Instantiates a new Get database dDL.
   *
   * @param path
   *     the path
   */
  private GetDatabaseDDL(final String path) {
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
  static List<String> createQueries(final String path) {

    final StringBuilder stringBuilder = new StringBuilder();
    final List<String> listOfQueries = new ArrayList<>(10000);

    try {
      final FileReader fileReader = new FileReader(new File(path));
      final BufferedReader bufferedReader = new BufferedReader(fileReader);

      //read the SQL file line by line
      String queryLine;
      while ((queryLine = bufferedReader.readLine()) != null) {
        // ignore comments beginning with #
        int indexOfCommentSign = queryLine.indexOf(POUNDSIGN);
        if (indexOfCommentSign != -1) {
          queryLine = queryLine.startsWith("#") ? "" : queryLine.substring(0,
              indexOfCommentSign - 1);
        }
        // ignore comments beginning with --
        indexOfCommentSign = queryLine.indexOf("--");
        if (indexOfCommentSign != -1) {
          queryLine = queryLine.startsWith("--") ? "" : queryLine.substring(0,
              indexOfCommentSign - 1);
        }
        // ignore comments surrounded by /* */
        indexOfCommentSign = queryLine.indexOf("/*");
        if (indexOfCommentSign != -1) {
          queryLine = queryLine.startsWith("#") ? "" : queryLine.substring(0,
              -1);
        }

        final StringBuilder builder = stringBuilder.append(queryLine);
        builder.append(' ');
        // ignore all characters within the comment
        do {
          queryLine = bufferedReader.readLine();
        }
        while (queryLine != null && !queryLine.contains("*/"));
        indexOfCommentSign = queryLine.indexOf("*/");
        if (indexOfCommentSign != -1) {
          queryLine = queryLine.endsWith("*/") ? "" : queryLine.substring(+2,
              queryLine.length() - 1);
        }

        //  the + " " is necessary, because otherwise the content before and after a line break
        // are concatenated
        // like e.g. a.xyz FROM becomes a.xyzFROM otherwise and can not be executed
        if (queryLine != null) {
          builder.append(' ');
        }
      }
      bufferedReader.close();

      // here is our splitter ! We use ";" as a delimiter for each request
      final String[] splittedQueries = COMPILE.split(stringBuilder.toString());

      // filter out empty statements
      for (final String splittedQuery : splittedQueries) {
        final String trim = splittedQuery.trim();
        if (trim != null && !trim.isEmpty() && !"\t".equals(
            trim)) {
          listOfQueries.add(splittedQuery);
        }
      }
    } catch (final FileNotFoundException exception) {
      exception.printStackTrace();
    } catch (final IOException exception) {
      exception.printStackTrace();
    } catch (final RuntimeException exception) {
      System.out.println("*** Error : " + exception.toString());
      System.out.println("*** ");
      System.out.println("*** Error : ");
      exception.printStackTrace();
      System.out.println("################################################");
      System.out.println(stringBuilder.toString());
    }
    return listOfQueries;
  }

  public static GetDatabaseDDL createGetDatabaseDDL(final String path) {
    return new GetDatabaseDDL(path);
  }
}