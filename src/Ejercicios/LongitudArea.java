package Ejercicios;

import java.util.Scanner;

public class LongitudArea {
    public static void main(String[] args) {
//        Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia.
//
//        Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
        Scanner sc = new Scanner(System.in);
        float radio;
        float longitudCircunferencia;
        float area;

        System.out.println("ingresa el radio de una circunferencia");
        radio = sc.nextFloat();
        longitudCircunferencia = (float) (2 * Math.PI*radio);
        area = (float) (Math.PI * Math.pow(radio,radio));
        System.out.println("El valor de la circunferencia es : " + longitudCircunferencia);
        System.out.println("El valor del área es : " + area);
    }
}
