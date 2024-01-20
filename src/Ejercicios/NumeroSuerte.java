package Ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class NumeroSuerte {
    public static void main(String[] args) {
//        Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
//                El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
//                Por ejemplo:
//        Si la fecha de nacimiento es 12/07/1980
//        Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
//        Número de la suerte: 28
        int dia;
        int mes;
        int anio;
        int numeroSuerte = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dia de tu nacimiento ");
        dia = sc.nextInt();
        System.out.println("Ingresa el mes de tu nacimiento ");
        mes = sc.nextInt();
        System.out.println("Ingresa el año de tu nacimiento");
        anio = sc.nextInt();
        int suma = dia + mes + anio;
        LinkedList<Integer> union = new LinkedList<>();
        while (suma > 0 ){
            union.add(suma % 10);
            suma = suma / 10;
        }

        while (!union.isEmpty()){
            numeroSuerte = numeroSuerte +  union.pop();
        }
        System.out.println("Tu numero de la suerte es : " + numeroSuerte);
    }
}
