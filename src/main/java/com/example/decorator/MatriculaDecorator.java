package com.example.decorator;

public abstract class MatriculaDecorator implements Matricula {

    protected Matricula matricula;

    public MatriculaDecorator(Matricula matricula) {
        this.matricula = matricula;
    }

    public String descricao() {
        return matricula.descricao();
    }

    public double calcularValor() {
        return matricula.calcularValor();
    }
}