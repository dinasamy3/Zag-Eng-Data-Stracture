import java.util.NoSuchElementException;

public class StackArrayBased {
    int size;
    int count;
 int[]items;
    public StackArrayBased(int size){
        this.size=size;
        items=new int[size];

    }
public StackArrayBased(){
        size=200;
        items=new int[size];
}
public void push(int value){
        if(size==count)
            CreateArray();
        items[count]=value;
        count++;
}
private void CreateArray(){
        size*=2;
                int[] newArray=new int[size];

    for(int i = 0; i<count; i++)
            newArray[i]=items[i];
                    items=newArray;
}
public boolean isEmpty(){
    return count==0;

}
public int peek(){
        if(isEmpty())
            throw new NoSuchElementException();
        return items[count];

}
public int pop(){
    if(isEmpty())
        throw new NoSuchElementException();
    int lastitem=items[count];
    count--;
    return lastitem;

}

}