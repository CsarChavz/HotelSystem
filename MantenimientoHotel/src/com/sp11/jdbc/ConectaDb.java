package com.sp11.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConectaDb {
	private final String database;
    private String message;

    public Connection getConnection() {
        Connection cn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, "root", "123456789");

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            setMessage(ex.getMessage());
        }

        return cn;
    }

    public ConectaDb() {
        this.database = "agenda";
    }

    public ConectaDb(String database) {
        this.database = database;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
