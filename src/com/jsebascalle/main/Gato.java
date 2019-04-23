package com.jsebascalle.main;

public class Gato extends Mascota {

	public Gato(String nombre,String raza,int edad) {
		super(nombre,raza,edad);
	}
	//METODO SOBRE ESCRIT
	@Override
	public void dormir() {
		System.out.println("El gato esta dormido");
	}
	
}
