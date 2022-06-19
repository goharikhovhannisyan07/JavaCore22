package group2.Chapter7;

public class VarArgs2 {
    static void VaTest(String msg, int... v) {
        System.out.print(msg + v.length + " possessed: ");
        for (int x : v) {
            System.out.print( x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        VaTest("One variable length parameter", 10);
        VaTest("One variable length parameter", 1,2,3);
        VaTest("One variable length parameter");
    }
}
