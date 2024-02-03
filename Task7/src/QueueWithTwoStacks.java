import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueWithTwoStacks {
    private final Stack<Integer> Stack1 = new Stack<>();
    private final Stack<Integer> Stack2 = new Stack<>();
    public void enqueue(int item){
        Stack1.push(item);
    }
    public int dequeue(){
        if (isEmpty())
            throw new NoSuchElementException("queue is empty");
        if (Stack2.isEmpty())
            moveStackOneToStacktwo();
        return Stack2.pop();
    }
    public int peek(){
        if (isEmpty())
            throw new NoSuchElementException("queue is empty");
        if (Stack2.isEmpty())
            moveStackOneToStacktwo();
        return Stack2.peek();
    }
    public boolean isEmpty(){
        return Stack1.isEmpty()&& Stack2.isEmpty();
    }

    private void moveStackOneToStacktwo() {
        while (!Stack1.isEmpty())
            Stack2.push(Stack1.pop());
    }
}
