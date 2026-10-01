package com.example.decorator;

public class MatriculaBasica implements Matricula {

    public String descricao() {
        return "Matrícula básica";
    }

    public double calcularValor() {
        return 500.0;
    }
}