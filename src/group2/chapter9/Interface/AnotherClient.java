package group2.chapter9.Interface;

public class AnotherClient {
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
