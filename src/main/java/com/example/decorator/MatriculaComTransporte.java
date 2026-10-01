package com.example.decorator;

public class MatriculaComTransporte extends MatriculaDecorator {

    public MatriculaComTransporte(Matricula matricula) {
        super(matricula);
    }

    public String descricao() {
        return super.descricao() + " + transporte escolar";
    }

    public double calcularValor() {
        return super.calcularValor() + 220.0;
    }
}