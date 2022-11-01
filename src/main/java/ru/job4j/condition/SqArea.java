package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = ((Math.pow(p / (2 * (k + 1)), 2)) * 2);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("When p=6, k=2, square is" + result1);
    }
}
