import java.util.Stack;


public class Main {
    public static void main(String[] args) {

        QueueArrayBased queue=new QueueArrayBased(7);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        reverse(queue);
       System.out.println(queue);
        QueueLinkedListBased linkedqueue = new QueueLinkedListBased<>();
        linkedqueue.enqueue(5);
        linkedqueue.enqueue(10);
        System.out.println(linkedqueue);
        }
    public static void reverse(QueueArrayBased queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
             stack.push(queue.dequeue());
        }

        while (!stack.isEmpty())

            queue.enqueue(stack.pop());

    }

    }

