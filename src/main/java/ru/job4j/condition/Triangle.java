package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean triangle = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(exist(3, 4, 3));
    }
}