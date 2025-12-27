package com.sonarsource.shapecore;

public class Rectangle extends ShapeCore {

    public Rectangle(Float length, Float width) {
        this.name = "Rectangle"; 
        this.length = length;
        this.breadth = width;
    }

    @Override
    public Float area() {
        return length * breadth;
    }
    
}
