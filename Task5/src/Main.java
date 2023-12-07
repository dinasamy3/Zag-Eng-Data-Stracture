import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static <E> void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Linkedlist<Double> list=new Linkedlist();
        list.addFirst((double)5.5);
        list.addFirst(10.0);
        list.addFirst(15.0);
        list.addLast(30.0);

        System.out.println("element in the linkedlist");

        list.printElements();
        System.out.println("size of linkedlist:" +list.size());
        System.out.println("index of 10" +list.indexOf(10.0));
        System.out.println("contains 15:"+ list.contains((double)15.0));
        list.removeFirst();
        list.removeLast();
        System.out.println("after removing first and last element");
        list.printElements();

        }
    }
