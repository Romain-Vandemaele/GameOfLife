import static org.junit.Assert.*;

import org.junit.Test;


public class CellTest {
	
	Cell cell_;

	@Before
	public void initialization() {
		cell_=new Cell();
	}
	
	@Test
	public void attributsShouldBeCorrectlyInitialized() {
		assertEquals("Test de l'etat initial",false,cell_.getState());
		assertEquals("Test de l'etat future initial",false,cell_.getFutureState());
		assertEquals("Test de la representation initiale",new String("0"),cell_.toString());
	}
	
	

}
