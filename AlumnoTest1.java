package junitPersona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("AlumnosTest1: PRUEBA DISTINTOS ASSERT Cada método crea un objeto de la clase alumno ")
class AlumnoTest1{
		
	@Test
	void testToString() {
		System.out.println("\t\tEn el método: \'testToString()\'");
		Alumno al=new Alumno();
		String aux=al.toString();
		assertEquals(aux,al.toString(),"Cadenas distintas");
	}

	/* 
	   Si cambiamos el número de matricula del alumno, la modificación se realiza con éxito utilizando la función assertEqual.  
*/
	@Test
	void testNumMatricula() {
		System.out.println("\t\tEn el método: \'testNumMatricula()\'");
		Alumno al=new Alumno();
		al.setNumMat("matriculaNueva");
		String resultado=al.getNumMat();
		assertEquals("matriculaNueva",resultado, "Error, distintas matriculas");
	}
	
	/* 
	 * Creamos un objeto alumno con una serie de valores y comprueba si es el mismo objeto con la función assertsame 
	 */
	@Test
	void mismoObjeto() {
		System.out.println("\t\tEn el método: \'mismoObjeto()\'");
		
		/*	Alumno alu1=new Alumno("Ana","918765432",20,"123",null);
		Alumno alu2=new Alumno("Ana","918765432",20,"123",null);
		assertSame(alu1,alu2, "Error, son objetos distintos");
		//Otra prueba:
		Alumno alu1=new Alumno("1234");
		Alumno alu2=new Alumno("1234");
		assertSame(alu1,alu2, "Error, son objetos distintos !!"); */
		Alumno alu1=new Alumno("1234");
		Alumno alu2;
		alu2=alu1;
		assertSame(alu1,alu2, "Error, son objetos distintos");
		System.out.println("El objeto \"alu1\" de la clase Alumno es el mismo que \"alu2\""); 
	}
	/* • Comprueba si dos objetos Alumno son iguales (desarrolla el método equals en la clase Alumnno que sólo compruebe el numero de matricula) */
	@Test
	void mismoContenido() {
		System.out.println("\t\tEn el método: \'mismoContenido()\'");
		/*
	Alumno alu1=new Alumno("Ana","918765432",20,"123",null);
		Alumno alu2=new Alumno("Ana","918765432",20,"123",null);
		assertEquals(alu1,alu2, "Error, el contenido de los objetos es  distinto");
		//Otra prueba:
		Alumno alu1=new Alumno("1234");
		Alumno alu2=new Alumno("1234");
		assertEquals(alu1,alu2, "Error, el contenido de los objetos es  distinto !!"); */
		Alumno alu1=new Alumno("1234");
		Alumno alu2;
		alu2=alu1;
		assertEquals(alu1,alu2, "Error, el contenido de los objetos es  distinto");
		System.out.println("El objeto \"alu1\" de la clase Alumno tienen el mismo contenido que \"alu2\"");
	}
	/*  Comprueba si el array de notas es NULL.*/
	@Test
	void testArrayNotasNull() {
		System.out.println("\t\tEn el método: \'testArrayNotasNull()\'");
		Alumno al=new Alumno();
		assertNotNull(al.getNota(), "Error, El array de notas es NULL");
		System.out.println("El objeto \"al\" de la clase Alumno tiene notas");
	}
	
}
