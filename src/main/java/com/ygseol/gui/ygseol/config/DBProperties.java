package com.ygseol.gui.ygseol.config;

import org.hibernate.internal.NamedQueryRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBProperties extends NamedQueryRepository {
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String user = "root";
    private static final String password = "4563";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, user, password);
    }
}
