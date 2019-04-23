package com.jsebascalle.main;

public class Calculadora {
	//SOBRECARGA DE METODOS (Diferencia en los parametros)
	
	//SUMA ENTEROS
	public int suma(int... valores) {
		int suma = 0;
		
		for(int numero : valores)
			suma += numero;
		
		return suma;
	}
	
	//SUMA FLOAT
	public float suma(float... valores) {
		float suma = 0;
		
		for(float numero : valores)
			suma += numero;
		
		return suma;
	}
	
	//SUMA DOUBLES
	public double suma(double... valores) {
		double suma = 0;
		
		for(double numero : valores)
			suma += numero;
		
		return suma;
	}
	
	
	
}
