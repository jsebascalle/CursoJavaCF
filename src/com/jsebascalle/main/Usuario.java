package com.jsebascalle.main;

public class Usuario {

	public String username;
	private String password; 
	
	//Sobrecarga constructor
	public Usuario(){
		this.username = "pepep";
		this.password = "";
	}
	
	public Usuario(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public Usuario(String username){
		this.username = username;
		this.password="";
	}
	
	public void saluda() {
		System.out.println("Este es mi nombre de usuario " + this.username);
	}
	
	//GETTER
	public String getPassword() {
		return this.password;
	}
	//SETTER
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setRol() {
		Admin admin = new Admin();
		admin.trabajar();
	}
	
	//clase anidada
	
	public class Admin{
		
		public void trabajar() {
			System.out.println("Admin "+ username +" trabajando!");
		}
		
		
	}
	
}
