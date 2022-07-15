package group2.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println(" a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[49] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Dividie by 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index obb: " + e);
        }
        System.out.println("After tyr/catch blocks ");
    }
}
