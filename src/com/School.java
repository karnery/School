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

    public void showAverageScoreByStudentName(String name) {
        for (int i = 0; i <= students.length - 1; i++) {
            Student currentStudent = students[i];
            if (currentStudent.name.equalsIgnoreCase(name)) {
                System.out.println("Выведен средний балл студента " + currentStudent.name);
                showAverageScore(currentStudent);
            }
        }
    }

    private void showAverageScore(Student student) {
        Grade[] grades = student.grades;
        double sumScore = 0;
        for (int i = 0; i < grades.length; i++) {
            Grade sumGrade = grades[i];
            sumScore += sumGrade.score;
        }
        double avg = sumScore / grades.length;
        System.out.println(avg);
    }

    public Grade[] getAllGrades() {
        ListGrades listGrades = new ListGrades();
        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            for (int a = 0; a < currentStudent.grades.length; a++) {
                Grade currentGrade = currentStudent.grades[a];
                listGrades.add(currentGrade);
            }
        }
        return listGrades.getAllGrades();
    }
    //   Grade[] allGrades = getAllGrades(students);
    //       for (int i = 0; i < allGrades.length; i++) {
    //       Grade currentGrade = allGrades[i];
    //       System.out.println(i + 1 + ". " + currentGrade.subjectName);
}
