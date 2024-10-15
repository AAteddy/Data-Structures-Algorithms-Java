package queue.queue_with_stack;

public class QueueWithStackDemo {
    public static void main(String[] args) {
        QueueWithStack queue = new QueueWithStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        var front = queue.dequeue();
        System.out.println(front);
        System.out.println(queue.peek());
    }
}
