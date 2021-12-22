package ejercicio1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Ejercicio1Test {
	private Ejercicio1 e;
	@Before
	public void setUp() throws Exception 
	{
      e = new Ejercicio1();
	}
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenerPlan() {
		e.obtenerPlan(false, true, true, true ,true , true, true , true, true, true, true, true, -6, 4);
		e.obtenerPlan(true, false, false, true ,true , true, true , true, true, true, true, true, -6, 4);
		e.obtenerPlan(true, false, false, true ,false , false, true , true, true, true, true, true, -6, 4);
		e.obtenerPlan(true, false, false, true ,false , false, true , true, true, true, true, true, 6, 4);
		e.obtenerPlan(true, false, false, true ,false , false, true , true, false, false, true, true, 16, 40);
		e.obtenerPlan(true, false, false, true ,false , false, true , true, false, true, true, true, 26, 40);
		e.obtenerPlan(true, false, false, true ,false , false, true , true, false, true, true, true, 40, 40);
	}

}
