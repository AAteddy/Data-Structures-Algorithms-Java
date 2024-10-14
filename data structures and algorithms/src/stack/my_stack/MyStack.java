package stack.my_stack;

import java.util.Arrays;

public class MyStack {
    private int[] stack;
    private int count;

    public MyStack(int size) {
        stack = new int[size];
    }

    public void push(int item) {
        if (count == stack.length)
            throw new StackOverflowError();

        stack[count++] = item;
    }

    public void pop() {
        if (count == 0)
            throw new IllegalStateException();

        count--;
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();

        return stack[count-1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(stack,0,count);
        return Arrays.toString(content);
    }

}
