package group2.chapter9.Interface;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegetive(10))
            System.out.println("10 is not negetive");
        if (nif.isNotNegetive(-12))
            System.out.println("this won't be displayed");


    }
}


