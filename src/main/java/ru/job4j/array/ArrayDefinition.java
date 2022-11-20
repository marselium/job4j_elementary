package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Array size is : " + ages.length);
        String[] surenames = new String[100500];
        System.out.println("Array size is : " + surenames.length);
        float[] prices = new float[40];
        System.out.println("Array size is : " + prices.length);
        String[] names = new String[4];
        names[0] = "Petr Yan";
        names[1] = "Fedor Emelianenko";
        names[2] = "Connor McGregor";
        names[3] = "Charles Oliveira";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
