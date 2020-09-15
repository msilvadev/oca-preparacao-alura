package com.msilvadev.basicjava.importpackages.financeiro;

import com.msilvadev.basicjava.importpackages.Pessoa;

import java.sql.Date;

class Pedido {
    // com.msilvadev.basicjava.importpackages.Pessoa cliente; // Está forma de referencia é chamada de Fully qualified name
    Pessoa cliente; // Está forma de referencia é chamada de full qualified name

    Date dataDeCriacao; // Se refere ao java.sql.Date;
    java.util.Date dataDeFinalizacao; // Obviamente se refere ao java.util.Date;

    // Classe definida em pacote default não pode ser acessada
    //TestDefaultPackage testDefaultPackage;

    public Pessoa getCliente(){ return cliente; }
}
