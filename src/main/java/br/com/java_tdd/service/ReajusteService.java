package br.com.java_tdd.service;

import br.com.java_tdd.modelo.Desempenho;
import br.com.java_tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.reajuste(reajuste);
    }
}
