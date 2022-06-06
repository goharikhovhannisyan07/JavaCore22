package group2.Chapter7;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob=new OverLoadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result= ob.test(135.25);
        System.out.println("Result of result= ob.test(135.25);" + result);
    }
}
