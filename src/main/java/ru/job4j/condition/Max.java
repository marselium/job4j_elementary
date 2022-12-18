package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, max(third, fourth)));
    }

    public static void main(String[] args) {
        int comparison = Max.max(122, 22);
        int comparsion1 = Max.max(3, 5, 2);
        int comparsion2 = Max.max(3, 6, 1, 7);
        System.out.println(comparison);
        System.out.println(comparsion1);
        System.out.println(comparsion2);
    }
}
