package Ejercicios;

import java.util.Scanner;

public class ParImpar {
//    Escribe un programa java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
//    Si por ejemplo A = 14 la salida será
//      14 es par
//    Si fuese por ejemplo A = 15 la salida será:
//            15 es i

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        a = sc.nextInt();

        String resultado = ((a % 2) == 0) ? "par" : "impar";
        System.out.println(" el numero" + a + " es : " + resultado);
    }
}
