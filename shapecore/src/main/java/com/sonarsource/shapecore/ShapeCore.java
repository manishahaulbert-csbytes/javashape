package com.sonarsource.shapecore;

public abstract class ShapeCore {

    protected String name = "shapeApp";
    protected Float length = 0.0f;
    protected Float breadth = 0.0f;

    public abstract Float area();
    
    public String getName() {
        return name;
    }
}




