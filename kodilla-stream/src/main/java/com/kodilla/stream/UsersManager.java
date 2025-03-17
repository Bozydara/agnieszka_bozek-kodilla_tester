package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        processUsersStreamWithFiltering();
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .map(user -> user.getUsername())
                .forEach(username -> System.out.println(username));
    }

    private static void processUsersStreamWthReferenceToTheFunction() {
        UsersRepository.getUsersList()
                .stream()
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    private static void processUsersStreamWithFiltering() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists")) // [1]
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }


    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List<User> getOlderUsers(int age) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .toList();
        return users;
    }

    public static String getUserNameWithTheBiggestNumberOfPosts() {
        List<Integer> usersNumberOfPost = UsersRepository.getUsersList()
                .stream()
                .map(User::getNumberOfPost)
                .toList();

        int numberOfPost = 0;
        int theHighestNumberOfPost = 0;

        for (int i = 0; usersNumberOfPost.size() > i; i++) {
            int userNoOfPost = usersNumberOfPost.get(i);
            if (userNoOfPost >= numberOfPost) {
                if (userNoOfPost >= theHighestNumberOfPost) {
                    theHighestNumberOfPost = userNoOfPost;
                }
            }
            numberOfPost = userNoOfPost;

        }

        List<User> users = UsersRepository.getUsersList();
        String name = "";
        for (User user : users) {
            if (user.getNumberOfPost() == theHighestNumberOfPost) {
                name = user.getUsername();
            }
        }
        return name;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}