package Ejercicios;

import java.util.Scanner;

public class Multiplo2o3 {
    public static void main(String[] args) {
        //averiguar si un numero es multiplo de 2 o 3
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa un numero : ");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero es multiplo de 2");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es multiplo de 3");
        }
    }
}
