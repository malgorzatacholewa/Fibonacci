package org.example.factorial;

import java.math.BigDecimal;

public class FactorialRecursive implements Factorial {

    @Override
    public BigDecimal getN(int n) {

        if (n < 0){
            throw new IllegalArgumentException("Podana liczba musi być większa lub równa 0");
        }
        if (n == 0 || n == 1){
            return new BigDecimal(1);
        } else
            return getN(n-1).multiply(new BigDecimal(n));
    }
}

