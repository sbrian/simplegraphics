package com.sbrian.simplegraphics.test;

import com.sbrian.simplegraphics.RealPositions;

import junit.framework.TestCase;

public class RealPositionsTestCase extends TestCase {

    public void testXPos() {
	RealPositions rp = new RealPositions(-2, 2, -2, 2, 1);
	assertEquals("If x is 0, real position should be 2", 2, rp.getRealX(0));
    }
    
    public void testXPos2() {
	RealPositions rp = new RealPositions(-2, 2, -2, 2, 1);
	assertEquals("If x is 1, real position should be 3", 3, rp.getRealX(1));
    }
    
    public void testXPos3() {
	RealPositions rp = new RealPositions(-2, 2, -2, 2, 3);
	assertEquals("If x is 1, real position should be 9", 9, rp.getRealX(1));
    }
    
    public void testYPos() {
	RealPositions rp = new RealPositions(-2, 2, -2, 2, 1);
	assertEquals("If y is 0, real position should be 2", 2, rp.getRealY(0));
    }
    
    public void testYPos2() {
	RealPositions rp = new RealPositions(-2, 2, -2, 2, 1);
	assertEquals("If y is 1, real position should be 1", 1, rp.getRealY(1));
    }
    
    public void testYPos3() {
	RealPositions rp = new RealPositions(-2, 2, -2, 2, 3);
	assertEquals("If y is 1, real position should be 3", 3, rp.getRealY(1));
    }
    
}
