package com.company.activity.improveintersection.lesson1.circlemath;

public class CircleOperations {
    // вычисление длины окружности через радиус
    // C = 2πr, где C — длина окружности, r — радиус окружности
    private double circleCircumference(int radius) {
        return 2.0 * Math.PI * radius;
    }

    public static void main(String args[]) {
        CircleOperations circleOperations = new CircleOperations();
        System.out.println(circleOperations.circleCircumference(79));
    }
}
