package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double half = (a + b + c) / 2;
        double rsl = Math.sqrt(half * (half - a) * (half - b) * (half - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rslt = TrgArea.area(2, 2, 2);
        System.out.println("Triangle area is" + rslt);
    }
}
