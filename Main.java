package basepackage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tree<Integer> bst = new Tree<>();
        Scanner sc = new Scanner(System.in);

        bst.insert(40);
        bst.insert(30);
        bst.insert(10);
        bst.insert(50);
        bst.insert(25);
        bst.insert(35);
        bst.insert(20);

        System.out.println("Nodes in ascending order:");
        bst.displayTree();

        System.out.println();

        System.out.println("Enter a number to search:");
        int input = sc.nextInt();
        Node<Integer> result = bst.search(input);

        if (result != null) {
            System.out.println("Found " + result.getData() + ".");
        } else {
            System.out.println(input + " was not found.");
        }

        System.out.println();

        System.out.println("Enter a number to delete:");
        input = sc.nextInt();

        if (bst.search(input) != null) {
            bst.delete(input);
        } else {
            System.out.println(input + " was not found.\n");
        }

        System.out.println();

        System.out.println("Nodes in ascending order");
        bst.displayTree();
    }
}
