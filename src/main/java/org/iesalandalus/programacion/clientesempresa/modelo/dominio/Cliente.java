package org.iesalandalus.programacion.clientesempresa.modelo.dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente {
	
	//Defino las variables con la visibilidad privada excepto FORMATO_FECHA que es público y sus expresiones regulares
	
	private String ER_CORREO = "[a-z0-9]+[a-z0-9]+@[a-z]+.[a-z]"; 
	private String ER_DNI = "[0-9]{8})([a-zA-Z])"; 
	private String ER_TELEFONO = "[6 7 9][1-9]{8}";
	public String FORMATO_FECHA = "dd/mm/YYYY";
	
	private String nombre; //atributos que si paso al constructor
	private String dni;
	private String correo;
	private String telefono;
	private LocalDate fechaNacimiento;
	
	
	//Creo los métodos especificados en el diagrama
	
	public Cliente (Cliente c) throws Exception //Constructor copia Cliente
	
	{
		//this.nombre = c.nombre; //hacer lo mismo con el resto de atributos
		this.setNombre(c.getNombre());
		this.setDni(c.getDni());
		this.setCorreo(c.getCorreo());
		this.setTelefono(c.getTelefono());
		this.setFechaNacimiento(c.getFechaNacimiento());
		
	}
	
	//Constructor Cliente
	
	public Cliente (String nombre, String dni, String correo, String telefono, LocalDate fechaNacimiento ) throws Exception 
	
	{
		this.setNombre(nombre);
		this.setDni(dni);
		this.setCorreo(correo);
		this.setTelefono(telefono);
		this.setFechaNacimiento(fechaNacimiento);
	}
	
	//Métodos Get

	public String getNombre()
	{
		return this.nombre; 
	}
	
	public String getDni() 
	
	{
		return this.dni;
	}
	
	public String getCorreo() 
	
	{
		return this.correo;
	}
	
	public String getTelefono() 
	
	{
		return this.telefono;
	}
	
	public LocalDate getFechaNacimiento() 
	
	{
		return this.fechaNacimiento;
	}
	
	//Creo método privado getIniciales
	
	Scanner in = new Scanner(System.in);
	
	String first = in.next();
	String last = in.next();
	
	String iniciales = first.substring(0,1) + "." + last.substring(0,1) + ".";
	
	private String getIniciales() 
	
	{
		return this.iniciales = iniciales;
	}
	
	//Métodos SET
	
	public void setNombre(String nombre) throws Exception 
	{
		if(nombre == null)
		{
			throw new Exception("Oye, el nombre no puede estar vacio");
		}
	
		this.nombre = nombre;
	}

	//comprobar tambien letra DNI
	
	public void setDni(String dni) throws Exception
	
	{
		
		if(dni == null)
		{
			throw new Exception("El dni no puede estar vacio");
		}

		this.dni = dni;
	
	}
	
	public void setCorreo(String correo) throws Exception
	
	{
		
		if(correo == null)
		{
			throw new Exception("El correo no puede estar vacio");
		}

		this.correo = correo;
	
	}
	
	public void setTelefono(String telefono) throws Exception
	
	{
		
		if(telefono == null)
		{
			throw new Exception("El telefono no puede estar vacio");
		}

		this.telefono = telefono;
	
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) throws Exception
	
	{
		
		if(fechaNacimiento == null)
		{
			throw new Exception("La fecha de nacimiento no puede estar vacia");
		}

		this.fechaNacimiento = fechaNacimiento;
	
	}
	
	//Metodo String ToString
	
	public String toString()
	{
		return "(" + this.iniciales + ")" + " - " + this.dni + " - " + this.correo + " - " + this.telefono;
				
	}
}
