import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int num) {
        data = num;
        left = null;
        right = null;
    }
}

public class Main {

    Node insert(Node root, int num) {
        if (root == null) {
            return new Node(num);
        } else if (num < root.data) {
            root.left = insert(root.left, num);
        } else {
            root.right = insert(root.right, num);
        }
        return root;
    }

    int findMin(Node root){
        if(root == null){
            return -1;
        }
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    int findMax(Node root){
        if(root == null){
            return -1;
        }
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }
    boolean searchElement(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
           return searchElement(root.left, key);
        }
        else{
            return searchElement(root.right, key);
        }
    }

    int height(Node root){
        if(root == null){
            return 0;
        }
        int max_left = height(root.left);
        int max_right = height(root.right);
        return Math.max(max_left, max_right) + 1;
    }
    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        Main tree = new Main();
        Scanner s = new Scanner(System.in);
        int choice = 0;
        
        while (true) {
            System.out.println("\n1. Insert\n2. Inorder\n3. Preorder\n4. Postorder\n5. Exit\n6.findMin\n7.findMax\n8.searchElement\n9,maxHeight");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            if (choice == 1) {
                System.out.print("Enter number to insert: ");
                int num = s.nextInt();
                root = tree.insert(root, num);
            } 
            else if (choice == 2) {
                System.out.print("Inorder traversal: ");
                tree.inorder(root);
            } 
            else if (choice == 3) {
                System.out.print("Preorder traversal: ");
                tree.preOrder(root);
            } 
            else if (choice == 4) {
                System.out.print("Postorder traversal: ");
                tree.postOrder(root);
            } else if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            } 
            else if(choice == 6){
                System.out.println("Minimum number is : ");
                System.out.println(tree.findMin(root));
            }
            else if(choice == 7){
                System.out.println("Maximum number is  : ");
                System.out.println(tree.findMax(root));
            }
            else if(choice == 8){
                int key = s.nextInt();
                boolean search = tree.searchElement(root,key);
                if(!search){
                    System.out.println("Key not found");
                }
            }
            else if(choice == 9){
                System.out.println(tree.height(root));
            }
            else{
                System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
