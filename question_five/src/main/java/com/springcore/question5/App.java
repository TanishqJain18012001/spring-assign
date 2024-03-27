package com.springcore.question5;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            List<Teacher> teachers = teacherModel.getAllteachersWithperiods();
            for (Teacher teacher : teachers) {
                System.out.println("Trainer: " + teacher.getName());
                System.out.println("Sessions:");
                for (Period period : teacher.getperiods()) {
                    System.out.println("- " + period.getName());
                }
                System.out.println();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}