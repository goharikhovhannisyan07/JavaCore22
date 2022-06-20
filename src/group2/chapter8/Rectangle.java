package group2.chapter8;

public class Rectangle extends FigureA {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }

}
