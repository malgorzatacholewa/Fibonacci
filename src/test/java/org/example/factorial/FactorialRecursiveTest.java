package org.example.factorial;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FactorialRecursiveTest {
    final private Factorial factorial= new FactorialRecursive();

    @Test
    public void shouldReturn24WhenNIs4() {
        //given
        final int n = 4;
        final BigDecimal expectedResult = new BigDecimal(24);

        //when
        BigDecimal result = factorial.getN(n);;

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn1WhenNIs0() {
        //given
        final int n = 0;
        final BigDecimal expectedResult = new BigDecimal(1);

        //when
        BigDecimal result = factorial.getN(n);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn1WhenNis1() {
        //given
        final int n = 1;
        final BigDecimal expectedResult = new BigDecimal(1);

        //when
        BigDecimal result = factorial.getN(n);;

        //then
        assertEquals(expectedResult, result);
    }

}