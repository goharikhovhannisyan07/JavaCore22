package group2.chapter7;

public class OverLoadDemo2 {
    void test(){
        System.out.println("No parametrs");

    }
    void test(int a, int b){
        System.out.println("a and b" + a + " " + b);


    }
    void test(double a){
        System.out.println("inside test (double) a: " + a);
    }

}
