package com;

class Student {
    String name;
    Grade[] grades;

    public Student(String name, Grade[] grades) {
        this.name = name;
        this.grades = grades;
    }
}

class Grade {
    String subjectName;
    int score;

    public Grade(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;

    }
}

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

class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        Grade[] mashaGrades = new Grade[2];
        mashaGrades[0] = new Grade("Математика", 5);
        mashaGrades[1] = new Grade("Английский язык", 4);
        students[0] = new Student("Маша", mashaGrades);

        Grade[] maxGrades = new Grade[3];
        maxGrades[0] = new Grade("Математика", 4);
        maxGrades[1] = new Grade("Английский язык", 4);
        maxGrades[2] = new Grade("Физкультура", 3);
        students[1] = new Student("Макс", maxGrades);

        School school = new School(students);

        school.showScoreByStudentName("маКс");

        school.showScoreBySubjectName("Английский язык");
    }
}
