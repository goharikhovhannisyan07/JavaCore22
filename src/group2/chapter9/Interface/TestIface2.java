package group2.chapter9.Interface;

public class TestIface2 {
    public static void main(String[] args) {
        CallBack c=new CallBackImplementation3();
        AnotherClient ob=new AnotherClient();
        c.callBack("Interface");


    }
}
