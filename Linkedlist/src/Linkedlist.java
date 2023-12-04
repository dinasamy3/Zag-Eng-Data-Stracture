import org.w3c.dom.*;

import javax.xml.soap.Node;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.util.NoSuchElementException;

public class Linkedlist {
    private class Node {
        public Node(int v) {
            value = v;
        }

        int value;
        Node nextNode;


    }

    Node first;
    Node last;
    private int size = 0;

    //time complexity :O(1)
    public void addFirst(int value) {
        Node node = new Node(value);
        node.value = value;

        if (first == null) {
            first = last = node;
            return;
        }
        node.nextNode = first;
        first = node;
        size++;
    }
    //time complexity :O(1)

    public void addLast(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
            return;
        }
        last.nextNode = node;
        last = node;
        size++;
    }

    //time complexity :O(1)
    public void removeFirst() {
        if (first == null)
            throw new NoSuchElementException("empty list");
        if (first == last) {
            first = last = null;
            return;
        }
//time complexity :O(1)

        Node temp = first;
        first = first.nextNode;
        temp.nextNode = null;
        size--;
    }

    //time complexity :O(n)
    public void removeLast() {
        if (first == null)
            throw new NoSuchElementException("empty list");
        if (first == last) {
            first = last = null;
            size--;
            return;
        }

        Node beforeLast = first;
        Node current = first;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }

        last = beforeLast;
        last.nextNode = null;
        size--;

    }

    //time complexity :O(n)
    public int indexOf(int value) {
        Node current = first;
        int index = 0;


        while (current != null) {
            if (current.value == value)
                return index;
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    //time complexity :O(n)
    public boolean contain(int value) {
        int index = indexOf(value);
        return index != -1;
    }

    //time complexity :O(n)
    public int size() {
        Node current = first;
        int index = 0;
        while (current != null) {
            index++;
        }
        return index;
    }

    //time complexity :O(n)
    public void printElements() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.nextNode;
        }
        System.out.println();

    }

    //time complexity :O(n)
    public int max() {
        if (first == null) {
            throw new IllegalStateException("list is empay");
        }
        int max = first.value;
        Node current = first.nextNode;
        while (current != null) {
            if (current.value > max) {

            }
            max = current.value;
        }
        return max;

    }

    //time complexity :O(n)
    public int min() {
        if (first == null) {
            throw new IllegalStateException("list is empy");

        }
        int min = first.value;
        Node current = first.nextNode;
        while (current != null) {
            if (current.value < min) {
                min = current.value;
            }
            current = current.nextNode;
        }
        return min;
    }
}