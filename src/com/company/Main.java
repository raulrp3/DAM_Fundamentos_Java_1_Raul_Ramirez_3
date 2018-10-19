package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion){
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case  0:{
                while(!sc.hasNextInt()){
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1:{
                while(!sc.hasNextDouble()){
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return  validado;
    }
    public static double calculaLongitud(double radio){
        return 2 * Math.PI * radio;
    }
    public static void main(String[] args) {
	    double radio,longitud;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!, vamos a calcular la longitud de una circunferencia.");
        System.out.print("Introduce radio: ");
        radio = validador(1);
        sc.close();
        longitud = calculaLongitud(radio);
        System.out.printf("El valor de la longitud de la circunferencia de radio %f es: %f\n", radio,longitud);
    }
}
