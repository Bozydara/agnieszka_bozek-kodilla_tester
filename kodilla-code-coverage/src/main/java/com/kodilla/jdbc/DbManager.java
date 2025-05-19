package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;                                 // [1]
    private static DbManager dbManagerInstance;              // [2]

    private DbManager() throws SQLException {                // [3]
        Properties connectionProps = new Properties();        // [4]
        connectionProps.put("user", "kodilla");          // [5]
        connectionProps.put("password", "kodilla");  // [6]
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_tester?serverTimezone=Europe/Warsaw"
                        + "&useSSL=False",
                connectionProps);             // [7]
    }                                                       // [8]

    public static DbManager getInstance() throws SQLException {  // [9]
        if (dbManagerInstance == null) {                          // [10]
            dbManagerInstance = new DbManager();                   // [11]
        }                                                         // [12]
        return dbManagerInstance;                                 // [13]
    }                                                           // [14]

    public Connection getConnection() {                          // [15]
        return conn;                                             // [16]
    }
}