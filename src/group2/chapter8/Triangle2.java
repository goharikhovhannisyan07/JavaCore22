package group2.chapter8;

public class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    double area2() {
        System.out.println("Inside area for triangle");
        return dim1 * dim2;
    }
}
