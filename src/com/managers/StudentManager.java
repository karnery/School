package com.managers;

import com.Student;

public interface StudentManager {
    void add(Student student);
    void get(String studentId);
    void remove(String studentId);
    void edit(String studentId, Student newStudent);
}
