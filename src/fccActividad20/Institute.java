package fcc.Actividad20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Agregación: el instituto reúne departamentos independientes. */
public class Institute {
    private final String instituteName;
    private final List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = new ArrayList<>(departments);
    }

    public String getInstituteName() {
        return instituteName;
    }

    public List<Department> getDepartments() {
        return Collections.unmodifiableList(departments);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public int getTotalStudentsInInstitute() {
        int total = 0;
        for (Department department : departments) {
            total += department.getStudents().size();
        }
        return total;
    }
}
