package learning.vladdubceac.decorator;

import learning.vladdubceac.decorator.abstraction.Shape;
import learning.vladdubceac.decorator.concrete.Circle;
import learning.vladdubceac.decorator.concrete.Rectangle;
import learning.vladdubceac.decorator.concrete.RedShapeDecorator;

public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectanlge = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectanlge.draw();
    }
}
