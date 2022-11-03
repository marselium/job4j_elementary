package ru.job4j.condition;

public class Point {
    public static double dist(int x1, int x2, int y1, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double dist1 = Point.dist(1, 3, 4, 1);
        System.out.println("Distance from (1,3) to 4,1 is " + dist1);
        double dist2 = Point.dist(1, 1, 3, 1);
        System.out.println("Distance from (1,1) to 3,1 is " + dist2);
    }
}
