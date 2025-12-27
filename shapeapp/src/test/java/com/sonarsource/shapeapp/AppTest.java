package com.sonarsource.shapeapp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import com.sonarsource.shapecore.ShapeCore;
import com.sonarsource.shapecore.Circle;
import com.sonarsource.shapecore.Rectangle;
import static org.junit.jupiter.api.Assertions.assertEquals;



/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    void testAppCanHandleMultipleShapes() {
        List<ShapeCore> shapes = new ArrayList<>();
        shapes.add(new Circle(3.0f));
        shapes.add(new Rectangle(4.0f, 5.0f));
        assertNotNull(shapes);
        assertEquals(2, shapes.size());

        for (ShapeCore shape : shapes) {
            assertNotNull(shape.getName());
            assertTrue(shape.area() > 0);
        }          
    }
}
