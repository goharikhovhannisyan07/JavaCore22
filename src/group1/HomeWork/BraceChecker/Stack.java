package group1.HomeWork.BraceChecker;

public class Stack {

    int[] array = new int[10];
    int index;

    Stack() {
        index = -1;

    }

    void push(int x) {
        if (index == 9) {
            System.out.println("stack is full");
        } else {
            array[++index] = x;
        }
    }

    int pop() {
        if (index < 0) {
            return 0;
        } else {
            return array[index--];
        }
    }
    public boolean isEmpty(){
        return index == -1;
    }
}