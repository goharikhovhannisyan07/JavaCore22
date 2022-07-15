package group2.chapter10;

public class TrowsDemo {
    static void trowOne() throws IllegalAccessException {
        System.out.println("Inside trowOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args)  {
        try {
            trowOne();
        }catch (IllegalAccessException e){
            System.out.println("caught" + e);
        }
    }
}
