package com.msilvadev.equalandhashcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EqualsAndHashCodeTest {

    public static void main(String... args) {
        testEqualsAndHashCode();
    }

    public static void testEqualsAndHashCode() {
        Employee e1 = new Employee();
        e1.setName("Matheus");
        e1.setCpf("222.333.444-22");
        e1.setCargo("software developer");
        Employee e3 = new Employee();
        e1.setName("Matheus");
        e1.setCpf("222.333.444-22");
        e1.setCargo("software developer");

        Company company = new Company();
        company.setName("Java");
        company.addEmployees(e1);
        company.addEmployeesHash(e1);
        company.addEmployeesHash(e3);

        Employee e2 = new Employee();
        e2.setName("Matheus");
        e2.setCpf("222.333.444-22");
        e2.setCargo("software developer");

        System.out.println(company.employeesHash.size());
    }
}
