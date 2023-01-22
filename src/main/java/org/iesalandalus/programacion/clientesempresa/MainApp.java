package org.iesalandalus.programacion.clientesempresa;


public class MainApp {
	
	private int NUM_MAX_CLIENTES;
	
	//creo array de lista de clientes

	public static void main(String[] args) {
		
		String mostrarClientes [] = {
				
				"Pedro Marquez",
				"Sonia Cabezas",
				"Federico Castillo"
		};
		
		System.out.println("Lista de clientes: " + mostrarClientes.length);
		
		for (String i: mostrarClientes) {
			System.out.println(i);
		}
	}
	

}