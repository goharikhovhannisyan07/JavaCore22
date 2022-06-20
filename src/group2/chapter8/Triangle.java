package group2.chapter8;

public class Triangle extends FigureA {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle");
        return dim1 * dim2;
    }

}
