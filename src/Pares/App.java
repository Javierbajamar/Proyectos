package Pares;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Ingrese el 1º rango de numeros (1-100): ");
        numero1 = scanner.nextDouble();

        System.out.println("Ingrese el 2º rango: ");
        numero2 = scanner.nextDouble();

        for (double i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            } else {
                System.out.println("El numero " + i + " es impar");
            }
        }
    }
}
