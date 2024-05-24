package com.app.schoolmanager.Models;

import com.app.schoolmanager.interfaces.UserInterface;

import java.nio.channels.ConnectionPendingException;
import java.sql.Connection;

public class User implements UserInterface {
    private int id;
    private String email;
    private String password;
    private Connection connection;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(UserInterface user) {

    }

    @Override
    public void read(int id) {

    }

    @Override
    public void update(UserInterface user) {

    }

    @Override
    public void delete(int id) {

    }
}
