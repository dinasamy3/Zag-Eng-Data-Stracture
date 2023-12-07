import org.w3c.dom.*;

import javax.xml.soap.Node;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.util.NoSuchElementException;

public class Linkedlist <E> {
    private class Node {

        private E value;
        Node nextNode;

        public Node(E value) {
            this.value = value;
        }

    }

    Node first;
    Node last;
    private int size = 0;

    //time complexity :O(1)
    public void addFirst(E value) {
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

    public void addLast(E item) {
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
    public int indexOf(E value) {
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
    public boolean contains(E value) {
        int index = indexOf(value);
        return index != -1;


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


    public void reverse() {
        if (first == null) {
            first = last = null;
            return;
        }
        Node previus = first;
        Node current = first.nextNode;
        while (current != null) {
            Node next = current.nextNode;
            current = next;
            previus = current;
            current.nextNode = previus;
        }
    }
public int size(){
        return size;
}

}