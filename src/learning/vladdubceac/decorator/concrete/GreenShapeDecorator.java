package learning.vladdubceac.decorator.concrete;

import learning.vladdubceac.decorator.abstraction.Shape;
import learning.vladdubceac.decorator.abstraction.ShapeDecorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        Shape component = decoratedShape;
        component.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("Border Color : Green");
    }
}
