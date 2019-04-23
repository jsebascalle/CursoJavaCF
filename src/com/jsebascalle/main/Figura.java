package com.jsebascalle.main;

//clases abstractas
public abstract class Figura {

	private int numLados;
	public static final float pi = 3.1416f;
	
	public Figura() {
		this.numLados = 0;
	}
	
	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public abstract float area(); //Se define pero no se le dice que hacer
}
