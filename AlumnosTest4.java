package junitPersona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.jupiter.api.AfterAll;
		import org.junit.jupiter.api.BeforeAll;
		@DisplayName("AlumnosTest4: PRUEBAS PARAMETRIZADAS")
		 class AlumnosTest4 {
		private static Persona p; 
			@BeforeAll
			static void testCreaPersona() {
				p=new Persona();
				System.out.println("Persona creada");
				
			}

			@AfterAll
			static void testEliminaPersona() {
				p=null;
				System.out.println("Persona eliminada");
			}

			@Test
			void testIgualTelefono() {
				String tel="912345678";
				System.out.println("Test comprueba telefono");
				p.setTelefono(tel);
				assertEquals(tel,p.getTelefono(),"Error, los telefonos no son iguales");
			}

			@Test
			void tesNombreNotNull() {
				String nom="Pepe Lopez";
				System.out.println("Test comprueba nombre");
				p.setNombre(nom);;
			    assertNotNull(p.getNombre(),"Error, el nombre  no es NULL");
					
			}

			@Test
			void testMismoContenido() {
				Persona p1=new Persona();
				Persona p2=new Persona();
				System.out.println("Test comprueba contenido");
				assertEquals(p1,p2,"Error son dos objetos con contenido distinto");	
			}

			@Test
			void testMismoObjeto() {
				Persona p1=new Persona();
				System.out.println("Test comprueba objetos");
				assertNotSame(p,p1,"Error son dos objetos distintos");	
			
			}
			@ParameterizedTest
			@DisplayName("setEdad parametrizado 1")
			@ValueSource(ints = {10,10,22,32})
			void cambiamosLaEdadParametrizado1(int edad) 
			{	System.out.println("Test comprueba edad parametrizado con assertEqual");
					p.setEdad(edad);
				assertEquals(edad, p.getEdad(), "Error, la edad no es la misma");
			}
			
			
			

			@ParameterizedTest
			@DisplayName("setEdad parametrizado 2")
			@ValueSource(ints = {-0,1,2,3})
			void cambiamosLaEdadParametrizado(int edad) 
			{
				System.out.println("Test comprueba edad parametrizado con assertTrue");
				p.setEdad(edad);
				assertTrue(edad == p.getEdad(), "Error, la edad no es la misma");
			}
			
			@ParameterizedTest
			@DisplayName("setTelefono parametrizado ")
			@ValueSource(strings = {"912345678","912223344","600222333"})
			void cambiamosElTelefonoParametrizado(String tel) 
			{
				System.out.println("Test comprueba telefono parametrizado con assertEquals");
				p.setTelefono(tel);
				assertEquals(tel,p.getTelefono(), "Error, el telefono no es el mismo");
			}

		}