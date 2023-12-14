package com.example;

import java.util.List;

public class SeatingChart {
    private Student[][] seats;

    // Constructor to implement a)
    public SeatingChart(List<Student> studentList, int rows, int cols) { // 3, 4
        int count = 0;
        int temp = 0;
        seats = new Student[rows][cols];
        for (int j = 0; j < seats.length; j++) {
            for (int i = 0; i < seats.length; i++) {
                if (count < studentList.size()) {
                    seats[temp][i] = studentList.get(count);
                    count++;
                } else{
                    seats[temp][i] = null;
                }
                
            }
            temp++;
            
        }

        // Your Implementation here
    }

    // Method to implement b)
    public int removeAbsentStudents(int allowedAbsences) {

        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] != null && seats[i][j].getAbsenceCount() > allowedAbsences) {
                    seats[i][j] = null;
                    count++;
                }

            }
        }

        return count;
        // Your Implementation here
    }

    public Student[][] getSeats() {
        return seats;
    }
}
