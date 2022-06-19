package group2.Chapter7;

public class AccessTest4 {
    public static void main(String[] args) {
        Test4 ob = new Test4();
        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a-> " +  ob.a + " b-> " + ob.b + " c-> " + ob.getc());
    }
}
