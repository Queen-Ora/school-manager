package com.app.schoolmanager.interfaces;

import com.app.schoolmanager.Models.Classroom;

public interface ClassroomInterface {
        void create(Classroom classroom);
        void read(int id);
        void update(Classroom classroom);
        void delete(int id);

    }
