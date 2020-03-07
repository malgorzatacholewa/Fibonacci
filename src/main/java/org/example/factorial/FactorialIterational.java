package org.example.factorial;

import java.math.BigDecimal;

public class FactorialIterational implements Factorial {

    @Override
    public BigDecimal getN(int n) {
        if (n == 0 || n == 1) {
            return new BigDecimal(1);
        } else {
            BigDecimal result = new BigDecimal(1);
            for (int i = 2; i <= n; i++) {
                result = result.multiply(new BigDecimal(i));
            }
            return result;
        }
    }
}