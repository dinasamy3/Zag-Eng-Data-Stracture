import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueArrayBased {

    int[] items;
    int size=0;
    int count=0;
    int first=0;
    int last=0;
    int temp;
    public QueueArrayBased(int size){
        this.size=size;
        items=new int[size];
    }
    public boolean isEmpty(){
        return count ==0;
    }
    public boolean isFull(){
        return count == size;
    }
    public void enqueue(int item){
        if (isFull())
            throw new NoSuchElementException();
        items[last]=item;
        last=(last+1)%size;
        count++;
    }
    public int dequeue(){
        if(isEmpty())
            throw new NoSuchElementException();
       int temp= items[first];
       items[first]=0;
        first=(first+1)%size;
        count--;
        return temp;
    }
    public String toString(){
        return Arrays.toString(items);

    }


}
