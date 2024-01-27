package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroCapicua {
    //identificando si un numero es capicua
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduzca número de 3 cifras: ");
        n = sc.nextInt();

        if (n >= 100 && n <= 999) {
            if (n % 10 == n / 100) { igual a la primera
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        } else { //si el número no tiene 3 cifras
            System.out.println("No es un número de 3 cifras");
        }
    }
}
