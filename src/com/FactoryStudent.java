package com;

import java.util.Arrays;

public class FactoryStudent {
    private String[] names = {"Елена", "Анна", "Станислав", "Игорь", "Марина", "Анатолий", "Борис", "Марк", "Алиса", "Антонина"};
    private int[] grades = {1, 2, 3, 4, 5};
    String[] subjects = {"Английский язык", "Французский язык", "Химия", "Физика", "Алгебра", "Геометрия", "Астрономия", "Физическая культура", "Рисование"};

    Student createStudent() {
        int n = (int) Math.floor(Math.random() * 10);
        Grade[] grades = new Grade[n];
        for (int i = 0; i <= grades.length - 1; i++) {
            grades[i] = getRandomGrade();
        }
        return new Student(getRandomName(), grades);
    }


    Student[] createStudents(int numOfStudents) {
        Student[] students = new Student[numOfStudents];
        for (int i = 0; i <= numOfStudents - 1; i++) {
            students[i] = createStudent();
        }
        return students;
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

        System.out.println("-----");

        Grade[] grades = student.grades;
        for (int i = 0; i <= grades.length - 1; i++) {
            Grade allGrade = grades[i];
            System.out.println("Студент " + student.name + " имеет следующую оценку по предмету: " + factoryStudent.getRandomSubject() + ": " + allGrade.score);
        }
        System.out.println("-----");
        Student[] students = factoryStudent.createStudents(5);
        for (int i = 0; i < students.length; i++) {
            Student student2 = students[i];
            System.out.println(student2.name + " - " + student2.grades.length);

        }

        System.out.println("=====");
        for (Student currentStudent : students) {
            System.out.println(currentStudent.name);
        }
        System.out.println("=====");
        Arrays.stream(students)
                .map(x -> x.name + " Сергеевич")
                .forEach(x -> System.out.println(x));
    }

}