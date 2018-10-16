package com.company;

import java.util.Scanner;

public class Main {
    public static double validarRadio(Scanner sc){
        double longitudValidado;
        while (!sc.hasNextDouble()){
            System.out.print("¡Introduce un valor numérico para el radio! ");
            sc.next();
        }
        longitudValidado = sc.nextDouble();
        return longitudValidado;
    }
    public static double calculaLongitud(double radio){
        return 2 * Math.PI * radio;
    }
    public static void main(String[] args) {
	    double radio,longitud;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!, vamos a calcular la longitud de una circunferencia.");
        System.out.print("Introduce radio: ");
        radio = validarRadio(sc);
        sc.close();
        longitud = calculaLongitud(radio);
        System.out.printf("El valor de la longitud de la circunferencia de radio %f es: %f\n", radio,longitud);
    }
}
