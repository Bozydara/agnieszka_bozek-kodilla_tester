package com.kodilla;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User user1 = new User("Aga", 15);
        User user2 = new User("Romek", 12);
        User user3 = new User("Ilona", 37);
        User user4 = new User("Gabriel", 21);
        User user5 = new User("Alina", 68);
        User user6 = new User("Edyta", 65);
        User user7 = new User("Aga", 80);

        User[] users = new User[]{user1, user2, user3, user4, user5, user6, user7};

        double sumOfUsersAge = 0.0;
        int i;
        for (i = 0; i < users.length; i++) {
            sumOfUsersAge += users[i].age;
        }
        double averageAge = sumOfUsersAge / users.length;

        for (i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }
}