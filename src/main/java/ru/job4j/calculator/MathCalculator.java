package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndSub(double first, double second) {
        return dividing(first, second) + substruction(first, second);
    }

    public static double sumOfEach(double first, double second) {
        return sum(first, second) + multiply(first, second) + dividing(first, second) + substruction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма деления и разности двух чисел равна " + divAndSub(12, 15));
        System.out.println("Сумма всех четырёх операций равна " + sumOfEach(10, 18));
    }
}

