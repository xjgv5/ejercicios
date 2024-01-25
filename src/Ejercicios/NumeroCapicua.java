package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroCapicua {
    //identificando si un numero es capicua
    public static void main(String[] args) {
        int numero;
        ArrayList<Integer> numeroArreglo = new ArrayList<>();
        ArrayList<Integer> numeroArregloReversa = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //System.out.println("Ingresa un numero : ");
        //numero = sc.nextInt();

        numero = 1234;

        while (numero > 0){
            numeroArregloReversa.add(numero % 10);
            numero = numero / 10;
        }
        for (int i = numeroArregloReversa.size(); i <= 0; i--){
            numeroArreglo.add(numeroArregloReversa.get(i));
        }
        System.out.println(numeroArreglo);
        System.out.println(numeroArregloReversa);
    }
}
