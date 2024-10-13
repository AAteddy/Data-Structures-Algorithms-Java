package linked_list.my_linked_list;

import java.util.Arrays;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
//        list.reverse();
//        list.removeLast();
//        list.removeFirst();
        System.out.println(list.hasCycle());
    }
}
