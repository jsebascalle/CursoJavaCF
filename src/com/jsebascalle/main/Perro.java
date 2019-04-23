package com.jsebascalle.main;

public class Perro extends Mascota{

	public Perro(String nombre,String raza,int edad) {
		super(nombre,raza,edad); //Sobre escritura de constructores
	}

	//METODO SOBRE ESCRIbir con super (conservando lo del padre)
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("El perro esta dormido");
	}
}