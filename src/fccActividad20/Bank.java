package fcc.Actividad20;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/** Asociación: un banco se relaciona con empleados que ya existen. */
public class Bank {
    private final String bankName;
    private Set<Employee> employees;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.employees = new LinkedHashSet<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = new LinkedHashSet<>(employees);
    }

    public Set<Employee> getEmployees() {
        return Collections.unmodifiableSet(employees);
    }
}
