package com.ygseol.gui.ygseol.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * MariaDB 연결 설정 유틸.
 */
public class DBProperties {
    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "4563";

    private DBProperties() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
