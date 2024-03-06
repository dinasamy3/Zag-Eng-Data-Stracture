public class Tree {
    private class Node{
        private int value;

        private Node rightChild;
        private Node lefttChild;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        Node node=new Node(value);
        if (root==null)
            root=node;
        else {
            Node parent=getParent(value);
            if (value> parent.value)
                parent.rightChild=node;
            else
                parent.lefttChild=node;
        }

    }
    private Node getParent(int value){
        Node current=root;
        Node parent=root;
        while (current!=null){
            parent=current;
            if (value>=current.value)
                current=current.rightChild;
            else
                current=current.lefttChild;
        }
        return parent;
    }
    public boolean find(int value){
        Node current =root;
        while (current!=null){
            if (current.value==value)
                return true;
            if (value>=current.value)
                current=current.rightChild;
            else
                current=current.lefttChild;
        }
        return false;
    }
    public int max() {
        int max =root.value;
        Node current=root;
        while (current!=null){
            max=current.value;
            current=current.rightChild;
        }
        return max;
    }
    public void PreOrder(){
        PreOrder(root);
    }
    private void PreOrder(Node root){
        if (root ==null)
            return;
        System.out.println(root.value);
        PreOrder(root.lefttChild);
        PreOrder(root.rightChild);
    }
    public void printDescending() {
        printDescending(root);
    }

    private void printDescending(Node root) {
        if (root == null)
            return;
        printDescending(root.rightChild);
        System.out.println(root.value);
        printDescending(root.lefttChild);
    }

    public int min() {
        Node current = root;
        while (current != null && current.lefttChild != null) {
            current = current.lefttChild;
        }
        return current.value;
    }
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.lefttChild);
        System.out.println(root.value);
        inOrder(root.rightChild);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.lefttChild);
        postOrder(root.rightChild);
        System.out.println(root.value);
    }
}
