package com.sonarsource.shapecore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CircleDuplicateTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCircleArea() {
        double radius = 5.0;
        CircleDuplicate circleDup = new CircleDuplicate((float) radius);
        double expectedArea = 3.14 * radius * radius;
        assertEquals(expectedArea, circleDup.area(), 0.01);
        assertEquals(expectedArea, circleDup.area1(), 0.01);
    }
    
}
