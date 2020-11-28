package calculosConsola;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraComplejaTest {
	CalculadoraCompleja calc;
	List<Integer> lista;
	List<Integer> lista2 = null;
	List<Integer> lista3;
	
	@Before
	 public void setUp() throws Exception {
	  calc = new CalculadoraCompleja();
	 //preparando lista1
	  lista.set(0,12000);
	  lista.set(1,12000);
	  lista.set(2,12000);
	  lista.set(3,12000);
	  lista.set(4,12000);
	 //preparando lista3
	  lista3.set(0,10500);
	  lista3.set(1,6000);
	  lista3.set(2,3000);
	  lista3.set(3,5000);
	  lista3.set(4,2500);
	  System.out.println("comienza el test");
	  
	 }

	 @After
	 public void tearDown() throws Exception {
	  System.out.println("fin testeo");
	 }
	 //test con montos que superen los 50000 en total
	@Test
	public void testCalcula(List<Integer>lista) {
		assertEquals(calc.calcula(lista), 6600);
	}
	//test para lanzar mensaje de lista vacía
	@Test
	public void testListaVacia(List<Integer> lista2) {
		assertEquals(calc.calcula(lista2), 0);
	}
	//test con montos diversos, prueba todas las posibilidades
	@Test
	public void testMontosVariados(List<Integer> lista3) {
		assertEquals(calc.calcula(lista3), 1995);
	}
}
