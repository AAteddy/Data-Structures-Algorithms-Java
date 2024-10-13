package linked_list.my_linked_list;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item)
                return index;
            else {
                current = current.next;
                index++;
            }
        }

        return -1;
    }

    public boolean contains (int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var previousNode = getPrevious(last);
            last = previousNode;
            last.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;

        while (current != null) {
            if (current.next == node)
                return current;
            else
                current = current.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        int index = 0;
        var current = first;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void reverse() {
        if (isEmpty())
            return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if(isEmpty())
            throw new IllegalStateException();

        var fast = first;
        var slow = first;
        for (int i = 0; i < k-1; i++) {
            fast = fast.next;
            if (fast == null)
                throw new IllegalArgumentException();
        }
        while (fast != last) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.value;
    }

    public boolean hasCycle() {
        if (isEmpty())
            throw new IllegalStateException();

        var fast = first.next;
        var slow = first;
        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;

            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

}
