package com.sonarsource.shapecore;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CircleTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCircleArea() {
        double radius = 5.0;
        Circle circle = new Circle((float) radius);
        double expectedArea = 3.14 * radius * radius;
        assertEquals(expectedArea, circle.area(), 0.01);
    }

    
}
