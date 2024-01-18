package Ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class SepararNumeros {
    //    Programa Java que lea un número entero de 3 cifras y
    //    muestre por separado las cifras del número.
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> pilaNumeros = new LinkedList<>();
        System.out.println("Ingresa un numero de 3 cifras");
        numero = sc.nextInt();
        while (numero > 0 ){
            pilaNumeros.push(numero % 10);
            numero = numero / 10;
        }

        while (!pilaNumeros.isEmpty()){
            System.out.println(pilaNumeros.pop());
        }
    }
}
