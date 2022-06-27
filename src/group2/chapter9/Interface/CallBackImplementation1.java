package group2.chapter9.Interface;

public class CallBackImplementation1 implements CallBack{

    @Override
    public void callBack(String message) {
        System.out.println("first impl: " + message);
    }
}
