package Ejercicios;

import java.util.Scanner;

public class CalcularPrecio {
//    Programa que calcule el precio de venta de un producto conociendo el precio
//    por unidad (sin IVA) del producto, el número de productos vendidos y el porcentaje de IVA aplicado.
//    Los datos anteriores se leerán por teclado.

    public static void main(String[] args) {
        int precioUnidad;
        int precioVenta;
        int cantidadProdVendidos;
        int porcentajeIva;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el precio por unidad");
        precioUnidad = sc.nextInt();
        System.out.println("Ingresa el precio de venta");
        precioVenta= sc.nextInt();
        System.out.println("Ingresa la cantidad de productos vendidos");
        cantidadProdVendidos= sc.nextInt();
        System.out.println("Ingresa el porcentaje de IVA");
        porcentajeIva = sc.nextInt();


    }
}
