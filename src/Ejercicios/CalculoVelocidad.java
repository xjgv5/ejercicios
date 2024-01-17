package Ejercicios;

import java.util.Scanner;

public class CalculoVelocidad {
    public static void main(String[] args) {
        int velocidadKM;
        int velocidadMH;
        Scanner sc = new Scanner(System.in);
        System.out.println("velocidad en km/h : ");
        velocidadKM = sc.nextInt();
        velocidadMH = velocidadKM * 1000 /3600;
        System.out.println("velocidadKM = " + velocidadKM);
    }
}
