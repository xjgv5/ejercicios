package Ejercicios;

import java.util.Scanner;

public class Multiplo3y5 {

    public static void main(String[] args) {
        //saber si un numero es multiplo de 3 y de 5
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero ");
        numero = sc.nextInt();
        System.out.println(numero % 3 == 0 && numero % 5 == 0 ? "Es multiplo de 3 y 5" : "No es multiplo de 3 y 5");

    }
}
