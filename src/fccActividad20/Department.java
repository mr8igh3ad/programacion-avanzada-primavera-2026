package fcc.Actividad20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Agregación: el departamento agrupa estudiantes creados por separado. */
public class Department {
    private final String deptName;
    private final List<Student> students;

    public Department(String deptName, List<Student> students) {
        this.deptName = deptName;
        this.students = new ArrayList<>(students);
    }

    public String getDeptName() {
        return deptName;
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
