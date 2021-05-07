package junitPersona;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages("junitPersona")
@SelectClasses( { AlumnoTest3.class,AlumnosTest4.class} )

@DisplayName("AlumnoTest5 SUITE DE PRUEBAS")




class AlumnoTest5 {

	@Test
	void test() {
		System.out.println("No implementado aun");
	}

}
