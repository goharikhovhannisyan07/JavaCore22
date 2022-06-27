package group2.chapter9.Interface;

public class CallBackImplementation2 implements CallBack{
    @Override
    public void callBack(String message) {
        System.out.println("second impl: " + message);
    }
}
