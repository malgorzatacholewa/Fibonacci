package org.example.factorial;


public class FactorialFactory {

    private static FactorialFactory instance = new FactorialFactory();

    private FactorialFactory(){};

    public static FactorialFactory getInstance() {
        return instance;
    }

    public Factorial produce(FactorialType variant) {
        if (FactorialType.RECURSIVE.equals(variant)) {
            return new FactorialRecursive();
        }
        if (FactorialType.ITERATIONAL.equals(variant)) {
            return new FactorialIterational();
        }
        return null;
    }
}
