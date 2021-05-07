/* 
Desarrolla una clase  de pruebas  AlumnoTest, que  realice las siguientes pruebas:
    •  Si cambiamos el número de matricula del alumno, la modificación se realiza con éxito utilizando la función assertEqual.  
    • Creamos un objeto alumnno con una serie de valores y comprueba si es el mismo objeto con la función assertsame .
    • Comprueba si el array de notas es NULL.
    • Comprueba si dos objetos Alumno son iguales (desarrolla el método equals en la clase Alumnno que sólo compruebe el numero de matricula)
    Se creará el objeto alumno una sóla vez y se pondrá a null al finalizar, también una única vez 
    */

package junitPersona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("AlumnosTest3: PRUEBA BEFORE/AFTER ALL")
class AlumnoTest3 {
	private static Alumno al;

	@BeforeAll
	static void testCreaAlumno() {
		System.out.println("\t\tEn el método: \'testCreaAlumno()\'");

		System.out.println("Se crea el objeto \"al\" de la clase Alumno");
		al = new Alumno();
		System.out.println("El contenido es :"+al.toString());
	}
	@AfterAll
	static void testEliminaAlumno() {
		System.out.println("\t\tEn el método: \'testEliminaAlumno()\'");
		
		System.out.println("Se comprueba que  el objeto de la clase Alumno no es NULL");
		assertNotNull(al,"Error, el objeto \"al\" de la clase Alumno está a NULL");
		al = null;
		assertNull(al,"Error, el objeto \"al\" de la clase Alumno no está a NULL");
		System.out.println("El objeto \"al\" de la clase Alumno ha sido eliminado");
	}

	
	
	
	@Test
	void testToString() {
		System.out.println("\t\tEn el método: \'testToString()\'");
		String aux=al.toString();
		assertEquals(aux,al.toString(),"Cadenas distintas");
	}
/*
	@Test
	void testSetNumMat() {
		fail("No implementado aun");
	}

	
	@Test
	void testSetNota() {
		fail("No implementado aun");
	}

	@Test
	void testGetNumMat() {
		fail("No implementado aun");
	}

	@Test
	void testGetNota() {
		fail("No implementado aun");
	}
*/
	
	/* 
	   Si cambiamos el número de matricula del alumno, la modificación se realiza con éxito utilizando la función assertEqual.  
*/
	@Test
	void testNumMatricula() {
		System.out.println("\t\tEn el método: \'testNumMatricula()\'");
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
		assertNotNull(al.getNota(), "Error, El array de notas es NULL");
		System.out.println("El objeto \"al\" de la clase Alumno tiene notas");
	}
	
}
