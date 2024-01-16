package Ejercicios;

import java.util.Arrays;

public class ProcesamientoTextos {
//    Input: ["break3ing news8:", "2A 1circle is round!"]
//
//    Output: "Breaking News: A Circle Is Round!"
//
//    Input: ["","Fresh fried fish - fish fresh fried"]
//
//    Output:"Fresh Fried Fish - Fish Fresh Fried"
//
//    Input: ["2here2", "is", " our STRING"]
//
//    Output: "Here Is Our STRING"
//
//    Input: ["123", "eat;sleep;repeat", "321"]
//
//    Output: "Eat;Sleep;Repeat"

    public static void main(String[] args) {
       String[] input = {"break3ing news8:", "2A 1circle is round!"};
       String output = transformarCadena(input);
        System.out.println(output);

    }

    public static String transformarCadena(String[] input){
        StringBuilder resultado = new StringBuilder();
        for(String frase : input){
            String[] palabras = frase.replaceAll("^a-zA-Z","").split("\\s+");
        }
    }


}
