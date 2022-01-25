package com;

class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        Grade[] mashaGrades = new Grade[2];
        mashaGrades[0] = new Grade("Физика", 4);
        mashaGrades[1] = new Grade("Английский язык", 4);
        students[0] = new Student("Маша", mashaGrades);

        Grade[] maxGrades = new Grade[4];
        maxGrades[0] = new Grade("Биология", 5);
        maxGrades[1] = new Grade("Английский язык", 4);
        maxGrades[2] = new Grade("Физкультура", 3);
        maxGrades[3] = new Grade("Астрономия", 5);
        students[1] = new Student("Макс", maxGrades);


        Grade[] allGrades = getAllGrades(students);
        for (int i = 0; i < allGrades.length; i++) {
            Grade currentGrade = allGrades[i];
            System.out.println(i + 1 + ". " + currentGrade.subjectName);
        }
        //School school = new School(students);

        //school.showScoreByStudentName("маКс");

        //school.showScoreBySubjectName("Английский язык");

        //school.showAverageScoreByStudentName("Макс");
    }

    private static Grade[] getAllGrades(Student[] students) {
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
}

