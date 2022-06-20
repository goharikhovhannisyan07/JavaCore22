package group2.chapter8;

public class SipleInheritance {
    public static void main(String[] args) {
        A superOb=new A();
        B SubOb=new B();
        superOb.i=10;
        superOb.j=20;
        System.out.println("Contentes of SyperOb");
        superOb.showij();
        System.out.println();
        SubOb.i=7;
        SubOb.j=8;
        SubOb.k=9;
        System.out.println("Contentes of SubOb");
        SubOb.showij();
        SubOb.showk();
        System.out.println();
        System.out.println("Sum of i, j and k  in SubOb ");
        SubOb.sum();
    }
}
