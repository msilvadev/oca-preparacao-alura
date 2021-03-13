package com.msilvadev.equalandhashcode;

import java.util.Objects;

public class Employee {

    private String name;
    private String cpf;
    private String cargo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Cada objeto tem um codigo hash e equal herdado de Object. Ou seja so
     * seria igual apenas se for a mesma instancia do objeto - Isso utilizando a implentacao da classe Object.
     * @param o
     * @return
     */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return cpf.equals(employee.cpf);
//    }

    @Override
    public int hashCode() {
        return 1;
    }
}
