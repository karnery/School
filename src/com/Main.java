package com;

class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        Grade[] mashaGrades = new Grade[3];
        mashaGrades[0] = new Grade("Французкий", 4);
        mashaGrades[1] = new Grade("Английский язык", 4);
        mashaGrades[2] = new Grade("Геометрия", 4);
        students[0] = new Student("Маша", mashaGrades);

        Grade[] maxGrades = new Grade[4];
        maxGrades[0] = new Grade("Математика", 5);
        maxGrades[1] = new Grade("Английский язык", 4);
        maxGrades[2] = new Grade("Физкультура", 3);
        maxGrades[3] = new Grade("Астрономия", 5);
        students[1] = new Student("Макс", maxGrades);

        School school = new School(students);
        Grade[] allGrades = school.getAllGrades();
        for (int i = 0; i < allGrades.length; i++) {
            Grade currentGrade = allGrades[i];
            // System.out.println(i + 1 + ". " + currentGrade.subjectName);
        }

        school.showScoreByStudentName("Макс");

        school.showScoreBySubjectName("Английский язык");

        school.showAverageScoreByStudentName("Маша");


    }
}

