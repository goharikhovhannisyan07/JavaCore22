package group2.chapter9.Interface;



public class Test {
    public static void main(String[] args) {
        CallBack callback;
        callback = new CallBackImplementation1(); //
        callback.callBack("kuku");

        callback = new CallBackImplementation2();
        callback.callBack("kuku");

        callback = new CallBackImplementation3();
        callback.callBack("kuku");
    }
}
