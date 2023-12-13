import java.util.NoSuchElementException;

public class StackBasedOnLinkedlist {
    private class Node{
        int value;
        Node next;


        public Node(int value) {
            this.value = value;
        }
    }
    Node top;
    public boolean isEmpty(){
        return top==null;

    }
    public void push(int value){
        Node node=new Node(value);
        node.next=top;
        top=node;
    }
    public int peek(){
     if (isEmpty())
         throw new NoSuchElementException();
     return top.value;
    }
    public int pop(){
        if (isEmpty())
        throw new NoSuchElementException();
int value= top.value;
top=top.next;


        return value;
    }
}
