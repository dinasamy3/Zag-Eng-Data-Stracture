public class HashTableLinearProbing {
    private class Node {
        private int key;
        private String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] table;

    public HashTableLinearProbing(int value) {
        table = new Node[value];
    }

    private int hash(int key) {
        return key % table.length;
    }

    public void put(int key, String value) {
        Node node = new Node(key, value);
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null && table[index].key != key) {
            index = (index + 1) % table.length;
            if (index == startIndex) {
                throw new IllegalStateException("Hash table is full.");
            }
        }

        table[index] = node;
    }

    public String get(int key) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (table[index].key == key) {
                return table[index].value;
            }
            index = (index + 1) % table.length;
            if (index == startIndex) {
                break;
            }
        }

        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (table[index].key == key) {
                table[index] = null;
                return;
            }
            index = (index + 1) % table.length;
            if (index == startIndex) {
                break;
            }
        }

        return;
    }

    public int size() {
        int count = 0;
        for (Node node : table) {
            if (node != null) {
                count++;
            }
        }
        return count;
    }
}

