package queue.array_queue;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int front, rear, count;

    public ArrayQueue(int length) {
        items = new int[length];
    }

    public void enqueue(int item) {
        if (count >= items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (count <= 0)
            throw  new IllegalStateException();

        var top = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return top;
    }

    public int peek() {
        return items[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
