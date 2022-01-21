package com;

class School {
    Student[] students;

    public School(Student[] students) {
        this.students = students;
    }

    public void showScoreByStudentName(String name) {
        for (int i = 0; i <= students.length - 1; i++) {
            Student currentStudent = students[i];
            if (currentStudent.name.equalsIgnoreCase(name)) {
                System.out.println("Выведены оценки студента " + currentStudent.name);
                showScore(currentStudent);
            }
        }
    }

    private void showScore(Student student) {
        Grade[] grades = student.grades;
        for (int i = 0; i <= grades.length - 1; i++) {
            Grade currentGrade = grades[i];
            System.out.println(currentGrade.subjectName + ": " + currentGrade.score);
        }
    }

    public void showScoreBySubjectName(String subjectName) {
        for (int i = 0; i <= students.length - 1; i++) {
            Student currentStudent = students[i];
            Grade[] grades = currentStudent.grades;
            for (int a = 0; a <= grades.length - 1; a++) {
                Grade currentGrade = grades[a];
                if (currentGrade.subjectName.equalsIgnoreCase(subjectName)) {
                    System.out.println("Имя студента: " + currentStudent.name + ". Оценка студента по предмету " + currentGrade.score);
                }
            }
        }
    }
}
