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
        float euro = Converter.rubleToEuro(300);
        float dollar = Converter.rubleToDollar(400);
        System.out.println((euro * 70) + " rubles are " + euro + " euro");
        System.out.println((dollar * 60) + "rubles are" + dollar + " dollar");
    }
}