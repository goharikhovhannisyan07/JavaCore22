package group2.chapter9;

public class SamePackage {
    SamePackage() {
        Protection P = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + P.n);
        System.out.println("n_pro = " + P.n_pro);
        System.out.println("n_pub = " + P.n_pub);


    }
}
