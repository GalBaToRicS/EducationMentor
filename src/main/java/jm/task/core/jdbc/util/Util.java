package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private Connection connection;
    public Util(){
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "postgres";
        String password = "password";

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Connection getConnection () {
        return connection;
    }
}
