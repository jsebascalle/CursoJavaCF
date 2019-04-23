package com.jsebascalle.ejercicios;

public class EjerciciosMatrizesJava {

	public static void main(String[] args) {
        //Crear un matriz de 5 x 5
        int matriz [][]= new int [5][5];
        //Llenar la matriz con números aleatorios.
        System.out.println("Los numeros aleatorios son:  ");
        for(int matrizes=0; matrizes<matriz.length;matrizes++) {
            for (int ma=0 ;ma<matriz[matrizes].length ;ma++) {
            matriz[matrizes][ma] = (int)(Math.random() * 100+1);
            }
        }
        for (int x[]:matriz) {
            
            for(int y: x) {
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
        //Mostrar en consola el promedio de la matriz.
        int suma=0, con=0, promedio=0;
        for(int contador=0; contador<matriz.length;contador++) {
            for (int contador2=0 ;contador2<matriz[contador].length ;contador2++) {
            suma+=matriz[contador][contador2];
            con++;
            }
        }
        promedio=suma/con;
        System.out.println("El promedio de la matriz es: "+promedio);
        //Mostrar en consola todos los números primos.
        System.out.print("Los numeros primos de la matriz son: ");
        for (int x[]:matriz) {
            for(int y: x) {
                int aux=0;
                    for(int i=1;i<=y;i++) {
                        if(y%i==0)
                        aux++;
                    }
                    if(aux==2)
                    System.out.print(y+",");
            }
        }
        System.out.println(" ");
        //Mostrar en consola el número mayor y la cantidad de veces que este se repite.
        System.out.print("El numero mayor es: ");
        int numayor=0, con2=0;
        for (int x[]:matriz) {
            for(int y: x) {
                if(y>numayor) {
                    numayor=y;
                    con2=0;
                }
                if(y==numayor)          
                    con2++;
                //System.out.print(y+" ");
            }
            
        }
        System.out.println(numayor+" "+"y se repite "+con2+ " veces.");
        //Mostrar en consola todos los números pares.
        System.out.print("Los numeros pares son: ");
        for (int x[]:matriz) {
            for(int y: x) {
                    if(y%2==0)
                    System.out.print(y+",");
            }
        }
        //Mostrar en consola la suma de las diagonales
        //diagonal izq a der
        int su=0, tot=0;
        for(int contador=0; contador<matriz.length;contador++) {
            int f=0;
            for (int contador2=0 ;contador2<matriz[contador].length ;contador2++) {
            su=matriz[contador][contador2];
            if(f==contador)
                break;
            else f++;
            }
            tot+=su;
        }
        //diagonal der a izq
        for(int contador=0; contador<matriz.length;contador++) {
            for (int contador2=0 ;contador2<matriz[contador].length-contador;contador2++) {
            su=matriz[contador][contador2];
            }
            tot+=su;
        }
        System.out.print("\nLas suma de las diagonales es: "+tot);
        //Mostrar en consola la suma de la la última fila.
        System.out.println(); int suma2=0;
        for (int x[]:matriz) {
            int j=0;
            for(int y: x) {
                j=y;
            }
            suma2+=j;
        }
        System.out.println("La suma total de la ultima fila es: "+suma2);
        //Mostrar en consola el mensaje "Cuadrado Mágico" si la matriz cataloga como un cuadrado mágico.
    
            
    }

}
