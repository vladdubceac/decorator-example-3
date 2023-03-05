package learning.vladdubceac.decorator.concrete;

import learning.vladdubceac.decorator.abstraction.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectanlge");
    }
}
