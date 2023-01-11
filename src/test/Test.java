package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import ss.jb4.main.Line;

class Test {

	private static final double DELTA = 0.001;

	@org.junit.jupiter.api.Test
	void testLine() {
		fail("Not yet implemented");
	}

	@org.junit.jupiter.api.Test
	void testGetSlope() {
		Line line1 = new Line(0,0,1,1);
		Line line2 = new Line(0,0,1,2);
		assertEquals(1.0, line1.getSlope(), DELTA);
		assertEquals(2.0, line2.getSlope(), DELTA);
	}

	@org.junit.jupiter.api.Test
	void testGetDistance() {
		Line line1 = new Line(0,0,1,1);
		Line line2 = new Line(0,0,2,2);
		assertEquals(1.4, line1.getDistance(), DELTA);
		assertEquals(2.8, line2.getDistance(), DELTA);
		
	}

	@org.junit.jupiter.api.Test
    public void testParallelTo() {
        Line line1 = new Line(2, 4, 6, 8);
        Line line2 = new Line(4, 8, 8, 12);
        Line line3 = new Line(2, 4, 8, 10);
        
        assertTrue(line1.parallelTo(line2));
        assertFalse(line1.parallelTo(line3));
    }


}
