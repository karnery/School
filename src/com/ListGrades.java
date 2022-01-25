package com;

public class ListGrades {
    private Grade[] allGrades = new Grade[0];
    private int currentIndex = 0;

    public void add(Grade grades) {
        if (allGrades.length >= currentIndex) {
            reCreateArray();
        }
        allGrades[currentIndex] = grades;
        currentIndex = currentIndex + 1;
    }

    public Grade[] getAllGrades() {
        return allGrades;
    }

    public void reCreateArray() {
        Grade[] old = allGrades;
        allGrades = new Grade[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            allGrades[i] = old[i];
        }
    }
}
