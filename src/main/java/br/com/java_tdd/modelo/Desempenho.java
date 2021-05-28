package br.com.java_tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal(.03);
        }
    },
    BOM{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal(.15);
        }
    },
    OTIMO{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal(.20);
        }
    };

    public abstract BigDecimal percentualReajuste();
}
