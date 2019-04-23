package com.jsebascalle.main;

//extendiendo de clase abstracta
public class Triangulo extends Figura {

	float base, altura;
	
	public Triangulo() {}
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//siempre se deben implementar sus metodos abstractos
	@Override
	public float area() {
		float area =  (this.base * this.altura) / 2;
		return area; 
	}
	
}
