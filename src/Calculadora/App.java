package Calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado;
        char operador;


        System.out.println("Ingrese el primer numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Ingresa un operador (+, -, *, /)");
        operador = scanner.next().charAt(0);

        System.out.println("Ingrese el segundo numero: ");
        numero2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero");
                    return;
                }
                break;
            default:
                System.out.println("Operador no válido");
                return;
        }

        System.out.println("Resultado: "+ resultado);

    }

}
