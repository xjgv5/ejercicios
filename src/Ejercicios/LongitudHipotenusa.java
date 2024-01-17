package Ejercicios;

import java.util.Scanner;

public class LongitudHipotenusa {
    //    Programa lea la longitud de los catetos
    //    de un triángulo rectángulo y calcule la longitud de la
    //    hipotenusa según el teorema de Pitágoras.
    public static void main(String[] args) {
        double cateto1;
        double cateto2;
        double hipotenusa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer cateto");
        cateto1 = sc.nextDouble();
        System.out.println("Ingresa el segundo cateto ");
        cateto2 = sc.nextDouble();
        System.out.println("Hipotenusa : " + Math.sqrt(Math.pow(cateto1, cateto1) * Math.pow(cateto2, cateto2)));
    }
}
