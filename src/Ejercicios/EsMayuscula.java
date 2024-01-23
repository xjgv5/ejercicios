package Ejercicios;

import java.util.Scanner;

public class EsMayuscula {
    public static void main(String[] args) {
        //programa que especifica si un caracter o cadena es minuscula o mayuscula
        String cadena;
        Scanner sc = new Scanner(System.in);
        String resultado;

        System.out.println("Ingresa una cadena para saber si esta en mayuscula o minuscula ");
        cadena = sc.nextLine();

        resultado = cadena.equals(cadena.toUpperCase()) == true ? "mayuscula" : "minuscula";
        
        System.out.println("La cadena capturada esta en " + resultado);
    }
}
