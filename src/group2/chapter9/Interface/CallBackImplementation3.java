package group2.chapter9.Interface;

public class CallBackImplementation3 implements CallBack{
    @Override
    public void callBack(String message) {
        System.out.println("third impl: " + message);
    }
}
