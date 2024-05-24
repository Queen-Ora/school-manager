package com.app.schoolmanager.Models;

import com.app.schoolmanager.IDBConfig.DBConfig;
import com.app.schoolmanager.interfaces.StudentInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;


public class Student implements StudentInterface {
    @Override
    public String getstate() {
        return null;
    }

    private int id;
    private String firstname;
    private String lastname;
    private String dateOfBirth;
    private  String placeOfBirth;

    private Classroom classroom;

    private Connection connection;

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public static void setplaceOfBirth(String placeOfBirth) {
    }

    public  int getId() {
        return id;
    }

    public static void setfirstname(String firstname) {
    }

    public static void setlastname(String lastname) {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public  void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }




    @Override
    public void create(Student student) throws SQLException {
        connection = DBConfig.getConnection();
        if (connection != null){

            String req = "INSERT INTO student (firstname, lastname,  dateOfBirth, placeOfBirth, classroom_id) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepareStatement = this.connection.prepareStatement(req);
            prepareStatement.setString(1,student.getFirstname());
            prepareStatement.setString(2, student.getLastname());
            prepareStatement.setString(3, student.getDateOfBirth());
            prepareStatement.setString(4, student.getPlaceOfBirth());
            prepareStatement.setInt(5, student.getClassroom().getId());


            prepareStatement.executeUpdate();
            prepareStatement.close();
            this.connection.close();


        }
    }

    @Override
    public void read(int id) {

    }

    @Override
    public void update(Student student) {

    }



    @Override
    public void delete(int id)  {

    }


}
