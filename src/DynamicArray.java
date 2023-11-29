public class DynamicArray {
    private int[] items;
    private int size = 0;
    private int count = 0;

    public DynamicArray(int n) {

        size = n;
        items = new int[size];
    }

    public DynamicArray() {
        size = 10;
        items = new int[size];
    }

    public void printArray() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i] + "   ");
        System.out.println();
    }

    public void insert(int item) {
        if (count == size)
            createArray();
        items[count] = item;
        count++;
    }


    private void createArray() {
        size = size * 2;
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++)
            newArray[i] = items[i];
        items = newArray;

    }

    public void removeAt(int indix) {
        if (indix < 0 || indix > count)
            throw new IllegalStateException("NOT Valid IndiX");
        for (int i = indix; i < count - 1; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (item == items[i])
                return i;
        return -1;
    }

    public int at(int indix) {
        if (indix < 0 || indix >= count) {
            System.out.println("invalid indix");
            return -1;
        }
        return items[indix];
    }

    public int max() {
        int max = items[0];
        for (int i = 1; i < count; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }
        return max;
    }

    public int min() {
        int min = items[0];
        for (int i = 1; i < count; i++) {
            if (items[i] < min) {
                min = items[i];
            }
        }
        return min;
    }

    public void remove(int item) {
        int index = indexOf(item);
        if (index != -1) {
            removeAt(index);
        } else {
            System.out.println("Item not found");

        }
    }
}
    