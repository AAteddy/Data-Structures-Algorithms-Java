package queue.priority_queue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (isFull())
            throw new IllegalStateException();

        var i = ShiftItemsToInsert(item);
        items[i] = item;
        count ++;
    }

    public int ShiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (item < items[i])
                items[i + 1] = items[i];
            else
                break;
        }

        return i + 1;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count >= items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
