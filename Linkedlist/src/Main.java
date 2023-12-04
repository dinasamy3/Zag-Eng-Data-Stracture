import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Linkedlist list=new Linkedlist();
        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(15);
        list.addLast(30);

        System.out.println("element in the linkedlist");

        list.printElements();
        System.out.println("size of linkedlist:" +list.size());
        System.out.println("index of 10" +list.indexOf(10));
        System.out.println("contain 15:"+ list.contain(15));
        list.removeFirst();
        list.removeLast();
        System.out.println("after removing first and last element");
        list.printElements();
        System.out.println("max element:" +list.max());
        System.out.println("min element:" +list.min());
        }
    }
