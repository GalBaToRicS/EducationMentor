package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String HOST = "jdbc:postgresql://localhost:5432/postgres";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "22335";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(HOST, LOGIN, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("exp");
            e.printStackTrace();
        }
        return connection;
    }
}