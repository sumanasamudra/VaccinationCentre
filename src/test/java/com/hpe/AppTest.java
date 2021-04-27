package com.hpe;




import junit.framework.TestCase;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private LocationFinder locationFinder;
	
	public void testDistance() {
		assertEquals(452.7653254823764, locationFinder.calculateDistance("Clark OspinaAge","52.161129420392996","-8.756068149165229"));
	}
	
	}
