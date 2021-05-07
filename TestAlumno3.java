package junitPersona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

 class TestAlumno3 {
	private static Alumno al;
	@BeforeAll
 static void inicializaObjeto(){
		int t[]={3,4,8,5};
		al=new Alumno("Pepe","912223423",20,"1234",t);
		System.out.println("Objeto creado");
	}
	@Test
	void testMedia() {
		System.out.println("\t\tEn testMedia()");
		assertEquals(al.obtenerMedia(al.getNota()),5,"Error en Media");
	}
	@AfterAll
	static void eliminaObjeto()
	{
		al=null;
		System.out.println("Objeto eliminado");
	}
}

