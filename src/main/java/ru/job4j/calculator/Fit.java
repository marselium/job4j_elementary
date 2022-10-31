package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heightw) {
        double rsl = (heightw - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        short heightw = 170;
        double woman = Fit.womanWeight(heightw);
        System.out.println("Man " + height + " is " + man);
        System.out.println("Woman " + heightw + " is " + woman);
    }
}
