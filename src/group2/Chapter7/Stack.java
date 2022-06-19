package group2.Chapter7;

public class Stack {
    private int[] stck = new int[10];
    private int index;

    Stack() {
        index = -1;

    }

    void push(int item) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++index] = item;

        }

    }

    int pop() {
        if (index < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stck[index--];
        }
    }

}
