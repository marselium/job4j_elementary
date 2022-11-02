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
        float ein = euro * 70;
        float eexpected = euro;
        float eout = Converter.rubleToEuro(ein);
        boolean epassed = eexpected == eout;
        System.out.println((euro * 70) + " rubles are " + euro + ". Test result : " + epassed);
        float din = dollar * 60;
        float dexpected = dollar;
        float dout = Converter.rubleToDollar(din);
        boolean dpassed = dexpected == dout;
        System.out.println((dollar * 70) + " rubles are " + dollar + ". Test result : " + dpassed);
    }
}
