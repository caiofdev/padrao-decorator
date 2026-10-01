package com.example.decorator;

public class MatriculaComMaterialDidatico extends MatriculaDecorator {

    public MatriculaComMaterialDidatico(Matricula matricula) {
        super(matricula);
    }

    public String descricao() {
        return super.descricao() + " + material didático";
    }

    public double calcularValor() {
        return super.calcularValor() + 180.0;
    }
}