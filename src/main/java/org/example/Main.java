package org.example;

import java.util.Scanner;

public class Main {

    void main() {
        //проверки
        assert Math.abs(gravitational_force.gravity(10,10,10) - 6.674e-11) < 1e-20; // считаем силу притяжения через функцию
        assert Math.abs(gravitational_force.gravity(100,100,10) - 6.674e-10) < 1e-20; //тут будет g*100
        assert Math.abs(gravitational_force.gravity(10,10,100) - 6.674e-13) < 1e-20;//тут будет g*0.01


        Scanner reader = new Scanner(System.in); // новая переменаая для того чтобы читать введенную с клавиатуры информацию.
        // ввод массы первого тела
        System.out.print("Введите массу первого тела (кг): "); //ввод данных
        double m1 = reader.nextDouble(); //читаем данные с клавиатуры

        // ввод массы второго тела
        System.out.print("Введите массу второго тела (кг): "); //ввод данных
        double m2 = reader.nextDouble(); //читаем данные с клавиатуры

        // ввод расстояния между телами
        System.out.print("Введите расстояние между телами (м): "); //ввод данных
        double r = reader.nextDouble(); //читаем данные с клавиатуры

        double F = gravitational_force.gravity(m1, m2, r); //вызов функции

        // вывод результата
        System.out.println("Сила притяжения F = " + F + " Н");

        reader.close(); // закрываем Scanner, чтобы освободить ресурсы
    }
}

