package group2.chapter10;

public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("called comput (" + a + ") ");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
    }
}
