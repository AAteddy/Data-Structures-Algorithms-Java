package queue.array_queue;

public class ArrayQueueDemo {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        var top = queue.dequeue();
        queue.dequeue();

        queue.enqueue(60);
        queue.enqueue(70);

        queue.dequeue();

        queue.enqueue(80);

        System.out.println(queue);
        System.out.println(top);
    }
}
