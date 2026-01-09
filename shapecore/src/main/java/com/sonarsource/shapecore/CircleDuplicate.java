package com.sonarsource.shapecore;

public class CircleDuplicate extends ShapeCore {

    public CircleDuplicate(Float radius) {
        this.name = "CircleDuplicate";
        this.length = radius;
        this.breadth = radius;
    }

    @Override
    public Float area() {
        return 3.14f * length * breadth;
    }

    @Override
    public String getName() {
        return name;
    }
   
    public Float area1() {
        return 3.14f * length * breadth;
    }
    
}
