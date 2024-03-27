package com.springcore.question5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class teacherModel {
    public static List<Teacher> getAllteachersWithperiods() throws SQLException {
        List<Teacher> teachers = new ArrayList<>();
        String query = "SELECT teacher.teacher_id, teacher.teacherName, period.period_id AS period_id, period.subjectName AS period_name " +
                "FROM teacher " +
                "LEFT JOIN period ON teacher.teacher_id = period.teacher_id";
        try (Connection connection = database.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int teacherId = resultSet.getInt("teacher_id");
                String teacherName = resultSet.getString("teacherName");
                Period period = new Period(teacherId, teacherName);
                period.setId(resultSet.getInt("period_id"));
                period.setName(resultSet.getString("period_name"));
                Teacher teacher = null;
                for (Teacher t : teachers) {
                    if (t.getId() == teacherId) {
                        teacher = t;
                        break;
                    }
                }
                if (teacher == null) {
                    teacher = new Teacher(teacherId, teacherName);
                    teacher.setId(teacherId);
                    teacher.setName(teacherName);
                    teacher.setperiods(new ArrayList<>());
                    teachers.add(teacher);
                }
                teacher.getperiods().add(period);
            }
        }
        return teachers;
    }
}