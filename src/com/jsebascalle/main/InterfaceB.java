package com.jsebascalle.main;

public interface InterfaceB {
	

	public abstract void mostrar();
	
	//metodo default
	public default void salud() {
		System.out.println("Hola desde interfaz");
		//solo los metodos default possen cuerpo y comportamiento dentro las interfaces
	};
}
