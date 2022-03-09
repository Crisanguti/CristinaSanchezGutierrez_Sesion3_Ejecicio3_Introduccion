package com.ej3introduccion;

public class Main {

    public static void main(String[] args) {

        //Primera parte: crear na función con 3 parámetros, que se sumen, llamarla en el main y darle valores.

        int resultado;

        resultado = suma (3, 4, 7);

        System.out.println("El resultado de la función es: " + resultado);

        //Segunda parte: crear clase coche y objeto en Main

        coche miCoche = new coche();

        int puertasTotales = miCoche.puertas(4, 1);

        System.out.println("El número de puertas final es: " + puertasTotales);

    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}
