package hu.meiit.gkpd4l.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesztBeadando {
	
	
	Beadando haromszog = null;
	
	@Before
	public void init() {
		
		haromszog = new Beadando();
	}
	
	
	@Test
	public void pitagoraszTeszt() {
		
		double vart = 5.0;
		
		double eredmeny = haromszog.pitagorasz(3.0, 4.0);	
		
	assertEquals(vart, eredmeny, 0.001);//A 0.001 egy úgynevezett delta érték. Azt adja meg, hogy double típusú változóknál milyen pontossági ellenőrizze, hogy a két szám egyenlő-e.
	}
	

	@Test
	public void pitagoraszTeszt2() {
		
		double vart = 5.0001;
		
		double eredmeny = haromszog.pitagorasz(3.0, 4.0);
		
	assertEquals(vart, eredmeny, 0.001); 
	}
	
	
	// Ebben a tesztben szándékosan olyan érték van megadva, hogy a teszt elbukjon.
	// De mivel megadtam a teszt argumentumában, hogy az az elvárt eredmény hogy megbukik a teszt, így a teszt sikeres lesz.
	@Test (expected = java.lang.AssertionError.class)    
	public void pitagoraszTeszt3() {                    
		
		double vart = 5.01;
		
		double eredmeny = haromszog.pitagorasz(3.0, 4.0);
		
	assertEquals(vart, eredmeny, 0.001);
	}
	
}
