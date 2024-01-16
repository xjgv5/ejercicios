package Ejercicios;

import java.util.Scanner;

public class FarenheitACentigrados {
    //    Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
//    La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
//    F = 32 + ( 9 * C / 5)
    public static void main(String[] args) {
        float gradosFarenheit;
        float gradosCentigrados;
        Scanner sc = new Scanner(System.in);

        System.out.println("Prgrama que convierte centigrados a farenheit");
        System.out.println("Ingresa una temperatura ");
        gradosCentigrados = sc.nextInt();
        gradosFarenheit = 32 + (9 * gradosCentigrados / 5);

        System.out.println("gradosFarenheit = " + gradosFarenheit);

    }
}
