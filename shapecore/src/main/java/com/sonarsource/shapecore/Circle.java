package com.sonarsource.shapecore;

public class Circle extends ShapeCore {

    public Circle(Float radius) {
        this.name = "Circle";
        this.length = radius;
        this.breadth = radius;
    }

    public Float area() {
        return 3.14f * length * breadth;
    }
    
}
