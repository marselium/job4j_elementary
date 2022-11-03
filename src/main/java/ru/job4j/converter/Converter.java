package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println((euro * 70) + " rubles are " + euro + " euro");
        System.out.println((dollar * 60) + "rubles are" + dollar + " dollar");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float dollarin = 120;
        float dollarexpected = 2;
        float dollarout = Converter.rubleToEuro(dollarin);
        boolean dollarpassed = dollarexpected == dollarout;
        System.out.println("140 rubles are 2. Test result : " + dollarpassed);
    }
}