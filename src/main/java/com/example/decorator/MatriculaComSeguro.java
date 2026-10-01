package com.example.decorator;

public class MatriculaComSeguro extends MatriculaDecorator {

    public MatriculaComSeguro(Matricula matricula) {
        super(matricula);
    }

    public String descricao() {
        return super.descricao() + " + seguro escolar";
    }

    public double calcularValor() {
        return super.calcularValor() + 50.0;
    }
}