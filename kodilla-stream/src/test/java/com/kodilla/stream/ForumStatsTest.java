package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.homework.ForumStats.getAveragePostsNumberFor40YearsAndOlderUsers;
import static com.kodilla.stream.homework.ForumStats.getAveragePostsNumberForUsersBelow40;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    @Test
    public void shouldReturnAverageNumberOfPostsFor40YearsAndOlderUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Rohan Rowland", 39, 46, "Teachers"));
        users.add(new User("Felix Garner", 40, 32, "Marketing"));
        users.add(new User("Regina Xiong", 41, 0, "Dancers"));
        users.add(new User("Rose Christensen", 80, 11, "Golfers"));
        users.add(new User("Nathanael Schwartz", 26, 87, "Singers"));

        assertEquals(14.33, getAveragePostsNumberFor40YearsAndOlderUsers(users), 0.01);
    }

    @Test
    public void shouldReturnAverageNumberOfPostsForUsersBelow40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Rohan Rowland", 39, 46, "Teachers"));
        users.add(new User("Felix Garner", 40, 32, "Marketing"));
        users.add(new User("Regina Xiong", 41, 0, "Dancers"));
        users.add(new User("Rose Christensen", 80, 11, "Golfers"));
        users.add(new User("Nathanael Schwartz", 26, 87, "Singers"));

        assertEquals(66.50, getAveragePostsNumberForUsersBelow40(users), 0.01);
    }
}