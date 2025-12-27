package com.sonarsource.shapeapp;

import java.util.ArrayList;
import java.util.List;
import com.sonarsource.shapecore.ShapeCore;
import com.sonarsource.shapecore.Circle;
import com.sonarsource.shapecore.Rectangle;
import java.util.logging.Logger;

public class ShapeApp {

    private static final Logger logger = Logger.getLogger(ShapeApp.class.getName());

    public static void main(String[] args) {
        List<ShapeCore> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0f));
        shapes.add(new Rectangle(4.0f, 6.0f));

        for (ShapeCore shape : shapes) {
           logger.info("shape: " + shape.getClass().getSimpleName());
           logger.info("Area: " + shape.area());             
        }
    }
}
