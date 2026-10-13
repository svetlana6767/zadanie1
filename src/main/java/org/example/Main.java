package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    void main() {
        // проверки
        assert Math.abs(gravitational_force.gravity(10, 10, 10) - 6.674e-11) < 1e-15;
        assert Math.abs(gravitational_force.gravity(100, 100, 10) - 6.674e-9) < 1e-15;
        assert Math.abs(gravitational_force.gravity(10, 10, 100) - 6.674e-13) < 1e-15;

        Scanner reader = new Scanner(System.in);

        try {
            System.out.print("Введите массу первого тела (кг): ");
            double m1 = reader.nextDouble();

            System.out.print("Введите массу второго тела (кг): ");
            double m2 = reader.nextDouble();

            System.out.print("Введите расстояние между телами (м): ");
            double r = reader.nextDouble();

            double F = gravitational_force.gravity(m1, m2, r);
            System.out.println("Сила притяжения F = " + F + " Н");

        } catch (InputMismatchException e) {
            System.out.println("Оgit шибка");
        } finally {
            reader.close();
        }
    }
}