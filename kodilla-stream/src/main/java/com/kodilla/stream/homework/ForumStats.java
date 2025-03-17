package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.util.List;

import static com.kodilla.stream.UsersRepository.getUsersList;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(getAveragePostsNumberFor40YearsAndOlderUsers(getUsersList()));
        System.out.println(getAveragePostsNumberForUsersBelow40(getUsersList()));
    }


    public static double getAveragePostsNumberFor40YearsAndOlderUsers(List<User> users) {
        List<User> users40andOlder = users
                .stream()
                .filter(u -> u.getAge() >= 40)
                .toList();

        double averageNumberOfPosts = users40andOlder
                .stream()
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();

        return averageNumberOfPosts;
    }

    public static double getAveragePostsNumberForUsersBelow40(List<User> users) {
        List<User> usersBelow40 = users
                .stream()
                .filter(u -> u.getAge() < 40)
                .toList();

        double averageNumberOfPosts = usersBelow40
                .stream()
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();

        return averageNumberOfPosts;
    }
}