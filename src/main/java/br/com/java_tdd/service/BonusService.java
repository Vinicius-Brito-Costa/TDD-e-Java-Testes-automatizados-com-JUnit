package br.com.java_tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.java_tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionarios com o salario maior que R$10.000,00 não recebem bonus.");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
