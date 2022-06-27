package group2.chapter9.Interface;

public class IfTest {
    public static void main(String[] args) {
       FixedStack mystack1=new FixedStack();
       FixedStack mystack2=new FixedStack();
        for (int i = 0; i <5 ; i++) mystack1.push(i);
        for (int i = 0; i <8 ; i++) mystack2.push(i);
        System.out.println("stack is mystack1: ");
        for (int i = 0; i <5 ; i++)
            System.out.println(mystack1.pop());
        System.out.println("stack is mystack2: ");
        for (int i = 0; i <8 ; i++)
            System.out.println(mystack2.pop());

    }
}
