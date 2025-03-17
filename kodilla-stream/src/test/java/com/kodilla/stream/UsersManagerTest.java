package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.UsersManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void shouldReturnChemistGroupUsernames() {

        List<String> actualList = filterChemistGroupUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");

        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnUsersOlderThanAgeProvided() {

        List<User> actualList = getOlderUsers(34);
        List<User> expectedList = new ArrayList<>();

        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(4, actualList.size());
        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnUserNameWithTheBiggestNumberOfPosts() {

        String expectedUserName = "Jessie Pinkman";
        String actualUserName = getUserNameWithTheBiggestNumberOfPosts();

        assertEquals(expectedUserName, actualUserName);
    }
}