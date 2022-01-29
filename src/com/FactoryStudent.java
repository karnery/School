package com;

public class FactoryStudent {
    private String names[] = {"Елена", "Анна", "Станислав", "Игорь", "Марина", "Анатолий", "Борис", "Марк", "Алиса", "Антонина"};

    Student createStudent() {
        return new Student(getRandomName(), new Grade[0]);
    }

    String getRandomName() {
        int n = (int) Math.floor(Math.random() * names.length);
        return names[n];
    }
}

class FactoryStudentTest {
    public static void main(String[] args) {
        FactoryStudent oneStudent = new FactoryStudent();
        oneStudent.createStudent();
        System.out.println(oneStudent.createStudent().name);

    }
}
