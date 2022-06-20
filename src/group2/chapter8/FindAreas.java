package group2.chapter8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FindAreas {
    public static void main(String[] args) {
        FigureA f = new FigureA(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        FigureA figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = f;
        System.out.println("Area is " + figref.area());
    }


}
