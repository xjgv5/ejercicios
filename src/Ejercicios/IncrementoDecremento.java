package Ejercicios;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("x = " + x);
        x++;
        System.out.println("x = " + x);
        //se incrementa el valor antes de mostrarlo
        System.out.println("++x = " + ++x);
        //se incrementa pero no se muestra ese incremento
        System.out.println("x++ = " + x++);
        System.out.println("++x = " + ++x);
    }
}
