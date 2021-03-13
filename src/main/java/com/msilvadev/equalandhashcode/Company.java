package com.msilvadev.equalandhashcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Company {

    private String name;
    private Collection<Employee> employees = new ArrayList<>();
    public Collection<Employee> employeesHash = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee employee) {
        this.employees.add(employee);
    }

    public boolean isEmployee(Employee employee){
        return this.employees.contains(employee);
    }

    public Collection<Employee> getEmployeesHash() {
        return employeesHash;
    }

    public void addEmployeesHash(Employee employeeHash) {
        this.employeesHash.add(employeeHash);
    }

    public boolean isEmployeeHash(Employee employee){
        return this.employeesHash.contains(employee);
    }
}
