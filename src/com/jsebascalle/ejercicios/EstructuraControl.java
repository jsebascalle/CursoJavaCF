package com.jsebascalle.ejercicios;

import java.util.Scanner;
import java.util.Arrays;

public class EstructuraControl {
    
    public static void main(String[] args) {
        
        /*Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje "Reprobado".*/
        System.out.println("Mostrar en consola el mensaje de \"Aprobado\" en caso la calificación de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje \"Reprobado\". \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificación: ");
        int calificacion = scanner.nextInt();        
        if (calificacion >= 70) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }                
        
        
        /* Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50*/
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50");
        
        int numeros[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();    
        }        
        int aux;
        int arregloOrdenado[];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        arregloOrdenado = numeros;        
        System.out.println("Números ordenados: " + Arrays.toString(arregloOrdenado));
        
        
        /* Imprimir en consola la tabla de multiplicar del número 9. */
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Imprimir en consola la tabla de multiplicar del número 9.");        
        System.out.print("Ingrese el número del que desea saber la tabla de multiplicar: ");
        int numeroTabla = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla * i));
        }

        
        /* Replicar la siguiente salida en consola.
        *
        **
        ***
        ****
        *****
        ******
         */
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Replicar la siguiente salida en consola. \n*\n**\n***\n****\n*****\n******");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Resultado: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Replicar la siguiente salida en consola. \n\t    *\n\t   ***\n\t  *****\n\t *******\n\t*********");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");        
        System.out.println("Resultado: ");
        for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        /* Imprimir en consola los primero diez números de la serie Fibonacci. */
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Imprimir en consola los primero diez números de la serie Fibonacci.");
        System.out.print("Ingrese cúantos números desea saber: ");
        int numeroSerieFibonacci = scanner.nextInt();
        int fibonaci = 1, termino1 = 0, termino2;
        for (int i = 1; i <= numeroSerieFibonacci; i++) {
            termino2 = termino1;
            termino1 = fibonaci + termino1;
            fibonaci = termino2;
            System.out.print(fibonaci + ", ");
        }
        System.out.println("");
        
        
        
        /* Dado un número saber si este es primo o no. */
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Dado un número saber si este es primo o no.");
        System.out.print("Ingrese el número: ");
        int numeroPrimo = scanner.nextInt();
        int numAux = 0;
        for (int i = 1; i < (numeroPrimo + 1); i++) {
            if (numeroPrimo % i == 0) {
                numAux++;
            }
        }
        if (numAux != 2) {
            System.out.println("El número " + numeroPrimo + " no es Primo");
        } else {
            System.out.println("El número " + numeroPrimo + " es Primo");
        }
        
        
        /* Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570. */
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570.");
        System.out.print("Ingrese el número del que desea saber sus multiplos: ");
        int multiplo = scanner.nextInt();
        int iterador = 1;
        System.out.print("Los multiplos del número " + multiplo + " son: ");
        do {
            if (iterador % multiplo == 0) {
                System.out.print(iterador + ", ");
            }
            iterador++;
        }while(iterador < 4570);
        System.out.println("");


        /* Dado un número entero obtener su factorial. */
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Dado un número entero obtener su factorial.");
        System.out.print("Ingrese el número del que desea saber su factorial: ");
        int numeroFact = scanner.nextInt();
        int fact = 1, num = numeroFact;
        while (numeroFact != 0) {
            fact *= numeroFact;
            numeroFact--;
        }
        System.out.println("El factorial de " + num + " es: " + fact);



        /* Crear un programa el cual nos permita conocer el valor de la constante e. */
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Crear un programa el cual nos permita conocer el valor de la constante e.");
        System.out.print("Ingrese el número del que desea conocer el valor de la constante e: ");
        int numeroConstante = scanner.nextInt();
        float e = 0f, factorial = 1f;
        for (int i = 1; i <= numeroConstante; i++) {
            factorial   *= i;
            e = e+(1.0f/factorial);
        }
        System.out.println("El valor de la constante de \"e\" del número: " + numeroConstante + " es: " + e);        
        
    }
}

