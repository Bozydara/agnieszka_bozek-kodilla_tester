package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.sql.SQLException;

class DbManagerTestSuite {
    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect() {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        String usersCountQuery = "SELECT ID FROM USERS";
        Statement statement = createStatement();
        ResultSet idsResultBeforeUpdate = statement.executeQuery(usersCountQuery);
        List<Integer> idsResultsListBeforeUpdate = getIdsResult(idsResultBeforeUpdate);

        insertUsers(statement);
        ResultSet idsResult = statement.executeQuery(usersCountQuery);
        List<Integer> idsResultsList = getIdsResult(idsResult);

        List<Integer> newUsersIds = new ArrayList<>();
        for (int i = idsResultsList.size(); i > idsResultsList.size() - 5; i--) {

            newUsersIds.add(i);
        }

        List<AbstractMap.SimpleEntry<Integer, String>> posts = List.of(
                new AbstractMap.SimpleEntry<>(newUsersIds.get(0), "What a beautiful spring!"),
                new AbstractMap.SimpleEntry<>(newUsersIds.get(0), "The holidays are coming"),
                new AbstractMap.SimpleEntry<>(newUsersIds.get(1), "Work smart"),
                new AbstractMap.SimpleEntry<>(newUsersIds.get(2), "The best movies from 2024"),
                new AbstractMap.SimpleEntry<>(newUsersIds.get(3), "To be healthy, do these 3 things"),
                new AbstractMap.SimpleEntry<>(newUsersIds.get(3), "Climate changes"),
                new AbstractMap.SimpleEntry<>(newUsersIds.get(3), "Who makes money from war?"),
                new AbstractMap.SimpleEntry<>(newUsersIds.get(4), "AI- a great threat to humanity?"));

        statement = createStatement();

        String postsCountQuery = """
                SELECT COUNT(*)\
                FROM USERS U
                JOIN POSTS P ON U.ID = P.USER_ID
                GROUP BY P.USER_ID
                HAVING COUNT(*) > 1""";

        ResultSet postsResultBeforeUpdate = statement.executeQuery(postsCountQuery);
        int count = getRowsSize(postsResultBeforeUpdate);
        insertPosts(statement, posts);

        //When
        String sqlQuery = """
                SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER
                FROM USERS U
                JOIN POSTS P ON U.ID = P.USER_ID
                GROUP BY P.USER_ID
                HAVING COUNT(*) > 1""";

        statement = createStatement();
        ResultSet postsResult = statement.executeQuery(sqlQuery);

        //Then
        Assertions.assertEquals(idsResultsListBeforeUpdate.size() + 5, idsResultsList.size());

        int counter = getResultsCountForPosts(postsResult);
        int expected = count + 2;
        Assertions.assertEquals(expected, counter);

        postsResult.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()
                    )
            );
        }
    }

    private void insertPosts(Statement statement, List<AbstractMap.SimpleEntry<Integer, String>> map) throws SQLException {
        for (AbstractMap.SimpleEntry<Integer, String> post : map) {
            statement.executeUpdate(
                    String.format("INSERT INTO POSTS(USER_ID, BODY) VALUES ('%d', '%s')",
                            post.getKey(),
                            post.getValue()
                    )
            );
        }
    }


    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static List<Integer> getIdsResult(ResultSet rs) throws SQLException {
        List<Integer> idsList = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("ID");
            idsList.add(id);
        }
        return idsList;
    }

    private static int getResultsCountForPosts(ResultSet rs) throws SQLException {
        int counter = 0;
        while (rs.next()) {
            System.out.printf("%s, %s, %d%n",
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"),
                    rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    private static int getRowsSize(ResultSet rs) throws SQLException {
        int count = 0;
        while (rs.next()) {
            rs.getInt("COUNT(*)");
            count++;
        }
        return count;
    }
}