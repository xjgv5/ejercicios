package Ejercicios;

import java.util.Scanner;

public class AreaTriangulo {
    //    Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), según la siguiente fórmula:
//    Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
//    donde p =  (a+b+c)/2
//    Para calcular la raíz cuadrada se utiliza el método Math.sqrt()
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double area;
        double p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer lado ");
        a = sc.nextDouble();

        System.out.println("Ingresa el segundo lado ");
        b = sc.nextDouble();

        System.out.println("Ingresa el tercer lado ");
        c = sc.nextDouble();

        p = (a + b+ c) / 2;
        area = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println("area = " + area);
    }
}
