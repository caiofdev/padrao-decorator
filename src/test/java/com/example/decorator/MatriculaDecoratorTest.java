package com.example.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculaDecoratorTest {

    @Test
    public void matriculaBasicaDeveTerValorBase() {
        Matricula matricula = new MatriculaBasica();
        assertEquals("Matrícula básica", matricula.descricao());
        assertEquals(500.0, matricula.calcularValor());
    }

    @Test
    public void matriculaComUmAdicionalDeveSomarOValor() {
        Matricula matricula = new MatriculaComSeguro(new MatriculaBasica());
        assertEquals("Matrícula básica + seguro escolar", matricula.descricao());
        assertEquals(550.0, matricula.calcularValor());
    }

    @Test
    public void matriculaComVariosAdicionaisDeveAcumularDescricaoEValor() {
        Matricula matricula = new MatriculaComTransporte(
                new MatriculaComMaterialDidatico(
                        new MatriculaComSeguro(
                                new MatriculaBasica())));

        assertEquals(
                "Matrícula básica + seguro escolar + material didático + transporte escolar",
                matricula.descricao()
        );
        assertEquals(950.0, matricula.calcularValor());
    }

    @Test
    public void ordemDiferenteDeDecoracaoDeveGerarDescricoesDiferentes() {
        Matricula matricula1 = new MatriculaComSeguro(new MatriculaComTransporte(new MatriculaBasica()));
        Matricula matricula2 = new MatriculaComTransporte(new MatriculaComSeguro(new MatriculaBasica()));

        assertNotEquals(matricula1.descricao(), matricula2.descricao());
        assertEquals(matricula1.calcularValor(), matricula2.calcularValor());
    }

    @Test
    public void mesmoAdicionalPodeSerAplicadoMaisDeUmaVez() {
        Matricula matricula = new MatriculaComSeguro(new MatriculaComSeguro(new MatriculaBasica()));
        assertEquals(600.0, matricula.calcularValor());
    }
}