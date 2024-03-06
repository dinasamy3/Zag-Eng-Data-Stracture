//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree tree =new Tree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("Preorder Traverse:");
        tree.PreOrder();

        System.out.println("Inorder Traverse:");
        tree.inOrder();

        System.out.println("Postorder Traverse:");
        tree.postOrder();

        System.out.println("Descending Order:");
        tree.printDescending();

        System.out.println("Max Number: " + tree.max());
        System.out.println("Min Number: " + tree.min());

        System.out.println("Element 4 exists: " + tree.find(4));
        System.out.println("Element 9 exists: " + tree.find(9));
    }
}