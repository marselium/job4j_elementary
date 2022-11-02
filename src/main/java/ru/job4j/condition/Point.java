package ru.job4j.condition;

public class Point {
    public static double distance1(int x1) {
        double rsl = x1;
        return rsl;
    }

    public static double distance2(int x2) {
        double rsl = x2;
        return rsl;
    }

    public static double distance3(int y1) {
        double rsl = y1;
        return rsl;
    }

    public static double distance4(int y2) {
        double rsl = y2;
        return rsl;
    }

    public static void main(String[] args) {
        double dist1 = Point.distance1(1);
        double dist2 = Point.distance2(4);
        double dist3 = Point.distance3(1);
        double dist4 = Point.distance4(4);
        double minus1 = Math.pow(dist2 - dist1, 2);
        double minus2 = Math.pow(dist4 - dist3, 2);
        double sqrt = Math.sqrt(minus1 + minus2);
        System.out.println("Distance from (" + dist1 + ',' + dist2 + ") to (" + dist3 + "," + dist4 + ") is " + sqrt);
    }
}
