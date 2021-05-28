package br.com.java_tdd.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTestes {

    @Test
    public void somaEntreDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        Integer soma = calculadora.somar(3, 5);
        Integer valorEsperado = 8;
        Assert.assertEquals(valorEsperado, soma);
    }
}
