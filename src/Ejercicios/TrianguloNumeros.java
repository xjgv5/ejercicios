package Ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class TrianguloNumeros {

    public static void main(String[] args) {
//        Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
//        Por ejemplo para un número N = 12345   La salida debe ser:
//        1
//        12
//        123
//        1234
//        12345
        int numero= 12345;

        System.out.println(numero/10000);
        System.out.println(numero/1000);
        System.out.println(numero/100);
        System.out.println(numero/10);
        System.out.println(numero/1);
    }
}
