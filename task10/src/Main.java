//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashTableChaining hashTable = new HashTableChaining(10);
        HashTableLinearProbing hash = new HashTableLinearProbing(10);


        hashTable.put(1, "Value 1");
        hashTable.put(2, "Value 2");
        hashTable.put(11, "Value 11");
        hashTable.put(12, "Value 12");

        hash.put(3, "Value 3");
        hash.put(2, "Value 2");
        hash.put(5, "Value 5");
        hash.put(7, "Value 7");



        System.out.println("Value for key 1: " + hashTable.get(1));
        System.out.println("Value for key 2: " + hashTable.get(2));
        System.out.println("Value for key 11: " + hashTable.get(11));
        System.out.println("Value for key 12: " + hashTable.get(12));

        System.out.println("Value for key 3: " + hash.get(3));
        System.out.println("Value for key 2: " + hash.get(2));
        System.out.println("Value for key 5: " + hash.get(5));
        System.out.println("Value for key 7: " + hash.get(7));


        hashTable.remove(2);


        System.out.println("Size of the hash table: " + hashTable.size());
    }
}