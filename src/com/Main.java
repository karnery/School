package com;

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
