/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import java.util.Scanner;

/**
 *
 * 
 */
public class Claseb {
 public static void main(String[] args) {
        double a, b, c; 
        double x1, x2, d; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca primer coeficiente (a):");
        a = scanner.nextDouble();

        System.out.println("Introduzca segundo coeficiente (b):");
        b = scanner.nextDouble();

        System.out.println("Introduzca tercer coeficiente (c):");
        c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser cero en una ecuación de segundo grado.");
        } else {
            d = (b * b) - (4 * a * c);

            if (d < 0) {
                System.out.println("No existen soluciones reales.");
            } else if (d == 0) {
                x1 = -b / (2 * a);
                System.out.println("Existe una solución real doble: x = " + x1);
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Las soluciones reales son x1 = " + x1 + " y x2 = " + x2);
            }
        }
        scanner.close();
    }
}

