package group2.chapter9.Interface;

public class DynStack {
    private int[] stck = new int[10];
    private int index;

    DynStack() {
        index = -1;

    }

    public void push(int item) {
        if (index == stck.length-1) {
            System.out.println("Stack is full");
        } else {
            stck[++index] = item;

        }

    }

    public int pop() {
        if (index < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stck[index--];
        }
    }
}
