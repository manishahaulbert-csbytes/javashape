package com.sonarsource.shapecore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class  RectangleTest {

@Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4.0f, 5.0f);
        float expectedArea = 20.0f;
        assertEquals(expectedArea, rectangle.area(), 0.001);
    }
    
}
