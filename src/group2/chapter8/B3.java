package group2.chapter8;

public class B3 extends A3 {
    int i;

    B3(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i is Superclass " + super.i);
        System.out.println("i is subclass " + i);
    }
}
