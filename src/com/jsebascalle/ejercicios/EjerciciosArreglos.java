package com.jsebascalle.ejercicios;

import java.util.Arrays;

public class EjerciciosArreglos {

	public static void main(String[] args) {
		
		// Definici�n del arreglo        
	    int listaNumeros[] = new int[100];

	    // Llenar el arreglo con n�meros aleatorios.
	    for (int i = 0; i < listaNumeros.length; i++) {
	        listaNumeros[i] = (int) (Math.random() * 101);
	    }

	    // Copiar arreglo (esto es para validar los datos)
	    int[] listaOrdenada = listaNumeros;

	    // Mostrar en consola el n�mero mayor.        
	    Arrays.sort(listaOrdenada);
	    int maxValue = listaOrdenada[listaOrdenada.length - 1];
	    System.out.println("El n�mero mayor es: " + maxValue);

	    // Mostrar en consola el n�mero menor
	    int minValue = listaOrdenada[0];
	    System.out.println("El n�mero menor es: " + minValue);

	    // Mostrar en consola todos los n�meros primos.
	    System.out.println("Los n�meros primos son: ");
	    for (int item : listaNumeros) {
	        int numAux = 0;
	        for (int i = 1; i < (item + 1); i++) {
	            if (item % i == 0) {
	                numAux++;
	            }
	        }
	        if (numAux != 2) {
	            //System.out.println("El n�mero " + item + " no es primo");
	        } else {
	            System.out.print(item + ", ");
	        }
	    }

	    // Mostrar en consola todos los n�meros pares.
	    System.out.println("\nLos n�meros pares son: ");
	    for (int item : listaNumeros) {
	        if (item % 2 == 0) {
	            System.out.print(item + ", ");
	        }
	    }

	    // Mostrar en consola el arreglo de forma ascendente
	    System.out.println("\nArreglo de forma ascendente: " + Arrays.toString(listaOrdenada));

	    // Mostrar en consola el promedio del arreglo.
	    int cantidad = 0;
	    double suma = 0;
	    for (int item : listaNumeros) {
	        suma += item;
	        cantidad++;
	    }
	    System.out.println("El promedio de los valores del arreglo es: " + (suma / cantidad));

	    // Mostrar en consola la suma del primer y �ltimo elemento del arreglo.
	    System.out.println("Suma del primer y �ltimo elemento del arreglo: " + (listaOrdenada[0] + listaOrdenada[listaOrdenada.length - 1]));

	    // Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.  
	    for (int item : listaOrdenada) {
	        if (item == 100) {
	            System.out.println("El n�mero cien existe en el arreglo.");
	            break;
	        }
	    }

	}

}
