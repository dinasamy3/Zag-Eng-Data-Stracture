import javafx.scene.control.TextArea;

public class Main {
    public static void main(String[] args) {

        DynamicArray array  =new DynamicArray(3);

        array.insert(5);
        array.insert(10);
        array.insert(15);
        array.insert(20);
        array.insert(25);
        System.out.println("Array");
        array.printArray();

        array.removeAt(1);
        System.out.println("Array after removing element at index 1:");
        array.printArray();
        System.out.println("Index of element 3: " + array.indexOf(3));
        System.out.println("Element at index 0: " + array.at(0));

        System.out.println("Maximum element: " + array.max());
        System.out.println("Minimum element: " + array.min());

        array.remove(10);
        System.out.println("Array after removing element 10:");
        array.printArray();

    }
}

