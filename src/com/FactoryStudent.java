package com;

public class FactoryStudent {
    private String[] names = {"Елена", "Анна", "Станислав", "Игорь", "Марина", "Анатолий", "Борис", "Марк", "Алиса", "Антонина"};
    private int[] grades = {1, 2, 3, 4, 5};
    String[] subjects = {"Английский язык", "Французский язык", "Химия", "Физика", "Алгебра", "Геометрия", "Астрономия", "Физическая культура", "Рисование"};

    Student createStudent() {
        Grade[] grades = new Grade[10];
        for (int i = 0; i <= grades.length - 1; i++) {
            grades[i] = getRandomGrade();
        }
        return new Student(getRandomName(), grades);
    }

    private Grade getRandomGrade() {
        return new Grade(getRandomSubject(), getRandomScore());
    }

    String getRandomName() {
        int n = (int) Math.floor(Math.random() * names.length);
        return names[n];
    }

    int getRandomScore() {
        int k = (int) Math.floor(Math.random() * grades.length);
        return grades[k];
    }

    String getRandomSubject() {
        int j = (int) Math.floor(Math.random() * subjects.length);
        return subjects[j];
    }

}

class FactoryStudentTest {
    public static void main(String[] args) {
        FactoryStudent factoryStudent = new FactoryStudent();
        Student student = factoryStudent.createStudent();
        factoryStudent.createStudent();
        System.out.println("Студент " + student.name + " имеет оценки: " + student.grades.length);


        Grade[] grades = student.grades;
        for (int i = 0; i <= grades.length - 1; i++) {
            Grade allGrade = grades[i];
            System.out.println("Студент " + student.name + " имеет следующую оценку по предмету: " + factoryStudent.getRandomSubject() + ": " + allGrade.score);

            //f
            // System.out.println("Студент " + student.name + " имеет следующие оценки по предметам: " + i);
        }

    }

}