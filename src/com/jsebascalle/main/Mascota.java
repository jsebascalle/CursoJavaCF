package com.jsebascalle.main;

public class Mascota {
	
	String nombre, raza;
	int edad;
	
	public Mascota() {
		this.nombre = "";
		this.raza = "";
		this.edad= 0;
	}
	
	public Mascota(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	void dormir() {
		System.out.println("El padre esta durmiendo");
	}
	
	void comer() {
		System.out.println("El perro esta comiendo");
	}
	
	void ladrar() {
		System.out.println("El perro esta ladrando");
	}
	
}
