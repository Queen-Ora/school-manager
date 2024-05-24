package com.app.schoolmanager.Models;

import com.app.schoolmanager.IDBConfig.DBConfig;
import com.app.schoolmanager.interfaces.ClassroomInterface;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Classroom implements ClassroomInterface {
    private int id;
    private String name;

    private Connection connection;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Classroom> list() throws SQLException {

        List<Classroom> classrooms = new ArrayList<>();


        connection = DBConfig.getConnection();
        if (connection != null) {
            String req = "SELECT * FROM classroom";
            PreparedStatement prepareStatement = this.connection.prepareStatement(req);

            ResultSet resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                Classroom classroom = new Classroom();
                classroom.setId(resultSet.getInt("id"));
                classroom.setName(resultSet.getString("name"));


                classrooms.add(classroom);
            }
            prepareStatement.close();
            this.connection.close();
        }
        return classrooms;
    }

    @Override
    public void create(Classroom classroom) {

    }

    @Override
    public void read(int id) {

    }

    @Override
    public void update(Classroom classroom) {

    }

    @Override
    public void delete(int id) {

    }
}
