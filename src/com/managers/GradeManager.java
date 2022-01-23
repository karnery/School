package com.managers;

import com.Grade;

public interface GradeManager {
    void add(Grade grade);
    void get(String gradeId);
    void remove(String gradeId);
    void edit(String gradeId, Grade newGrade);
}
