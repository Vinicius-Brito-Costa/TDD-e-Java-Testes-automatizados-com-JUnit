package br.com.java_tdd.service;

import br.com.java_tdd.modelo.Funcionario;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @Test
    public void funcionarioComSalarioMuitoAltoNaoTemBonus(){
        BonusService bonusService = new BonusService();


        assertThrows(IllegalArgumentException.class, () ->
                bonusService.calcularBonus(new Funcionario("Vinicius",
                        LocalDate.now(),
                        new BigDecimal(25000)))
        );
    }

    @Test
    public void bonusDeveriaSerDezPorcentoDoSalario(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(2500)));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void bonusDeveriaSerDexPorcentoParaSalarioDeExatamente10000(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(10000)));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}