package queue.priority_queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);

        queue.insert(5);
        queue.insert(7);
        queue.insert(1);
        queue.insert(3);
        queue.insert(6);

        System.out.println(queue);


        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
