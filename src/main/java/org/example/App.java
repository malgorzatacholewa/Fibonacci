package org.example;

import org.example.factorial.Factorial;
import org.example.factorial.FactorialFactory;
import org.example.factorial.FactorialType;
import org.example.fibonacci.Fibonacci;
import org.example.fibonacci.FibonacciFactory;
import org.example.fibonacci.FibonacciType;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        int n = 5;
        FibonacciType variant = FibonacciType.ITERATIONAL;

        FibonacciFactory factory = new FibonacciFactory();
        Fibonacci fibonacci = factory.produce(variant);

        BigDecimal result = fibonacci.findN(n);

        System.out.println("Wyraz nr " + n + " ciągu Fibonacciego to " + result);

        int i = 4;
        FactorialType variant1 = FactorialType.ITERATIONAL;

        FactorialFactory factoryFac = FactorialFactory.getInstance();
        Factorial factorial = factoryFac.produce(variant1);

        BigDecimal resultFactorial = factorial.getN(i);

        System.out.println(i + " silnia to " + resultFactorial);

    }
}
