package com.app.schoolmanager.interfaces;

import com.app.schoolmanager.Models.Student;

import java.sql.SQLException;

public interface StudentInterface {
    void create(Student student) throws SQLException;
    void read(int id);
    void update(Student student);
    void delete(int id);

    String getstate();
}


