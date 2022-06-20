package group2.chapter8;

public class Rectangle2 extends Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);

    }
    double area(){
        System.out.println("Inside area for rectangle");
        return dim1*dim2;
    }
}
