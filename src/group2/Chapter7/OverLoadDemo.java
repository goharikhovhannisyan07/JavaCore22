package group2.Chapter7;

public class OverLoadDemo {
    void test(){
        System.out.println("No parametrs");
    }
    void test (int a){
        System.out.println("a: " + a);
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test(double a){
        System.out.println("double a " + a);
        return  a*a;
    }

}
