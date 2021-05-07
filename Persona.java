package junitPersona;

public class Persona 
{
	private String nombre;
	private String telefono;
	private int edad;
	
	public Persona() {
		nombre="Pepe";  
		edad=21;
		telefono="777654321";
			}
	public Persona(String nom,String tel,int edad) {
		nombre=nom;  
		this.edad=edad;
		telefono=tel;
			}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nomb){
		nombre = nomb;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public void setTelefono(String tel) {
		telefono = tel;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void vis(){
	System.out.println("Nombre: "+ nombre+" Edad: "+edad+" Telefono: "+telefono);
	}
public String toString ()	{
		return "nombre= "+nombre+" Telefono "+telefono+ "Edad "+edad;
		}
public boolean equals(Object obj)
{
	Persona  pers1 = (Persona)obj;
	String nom1=pers1.nombre;
	String nom2=this.nombre;
	String telefono1=pers1.telefono;
	String telefono2=this.telefono;
	int edad1=pers1.edad;
	int edad2=this.edad;
	return nom1.equals(nom2) &&  telefono1.equals(telefono2)  && edad1==edad2;
}
}	
