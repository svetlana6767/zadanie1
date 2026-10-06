package org.example;

public class gravitational_force {
    // Функция вычисляет силу притяжения.
    // m1 - масса первого тела, m2 - масса второго тела,
    // r - расстояние. G - гравитационная постоянная.
    //возвращает ответ типа double
    static double gravity(double m1, double m2, double r) {

        final double G = 6.674e-11;
        return G * m1 * m2 / (r * r); //возвращаем результат
    }
}
