package com.sonarsource.shapecore;

public class Square extends ShapeCore {

    public Square(Float length, Float width) {
        this.name = "Square"; 
        this.length = length;
        this.breadth = width;
    }

    @Override
    public Float area() {
        return length * breadth;
    }

    public Float area1() {
        return length * breadth;
    }
    
}
