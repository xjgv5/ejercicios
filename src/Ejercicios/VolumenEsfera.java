package Ejercicios;

import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
//        Programa que tome como dato de entrada un número que corresponde a la
//        longitud del radio una esfera y nos calcula y escribe el volumen de la
//        esfera que se corresponden con dicho radio.
//
//        La fórmula para calcular el volumen de la esfera es
//        v = (4/3)*PI*r^3
        double radio;
        double volumen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la longitud del radio de la esfera");
        radio = sc.nextDouble();
        volumen = (4/3)*Math.PI*Math.pow(radio,3);
        System.out.println("volumen = " + volumen);
    }
}
