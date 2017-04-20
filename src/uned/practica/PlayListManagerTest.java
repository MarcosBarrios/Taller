package uned.practica;

import es.uned.lsi.eped.pract2016_2017.PlayListManager;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PlayListManagerTest extends TestCase{

	public PlayListManagerTest(String testName){
		super(testName);
	}
	
	public static Test suite(){
		return new TestSuite(PlayListManagerTest.class);
	}
	
	public void testContains(){
		PlayListManager plm = new PlayListManager();
		
		plm.createPlayList("Canciones de rock");
		plm.createPlayList("Canciones de dubstep");
		plm.createPlayList("Future Rising");
		
		assertEquals(true, plm.contains("Canciones de rock"));
		assertEquals(false, plm.contains("Canciones navideñas"));
		assertEquals(false, plm.contains(""));
	}
	
}
