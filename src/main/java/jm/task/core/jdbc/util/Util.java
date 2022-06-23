package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    // реализуйте настройку соединения с БД

    private static final String USERNAME = "root";
    private static final String PASSWORD = "789052";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection =  DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection completed!");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection is missing!");
            e.printStackTrace();
        }
        return connection;
    }
}