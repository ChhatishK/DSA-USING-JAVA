import java.util.*;

   
public class AVL{
    static class Node {
        int data;
        Node left;
        Node right;
        int height;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            height = 1;
        }
    }
    public static int avl(Node root){
    
        if(root == null){
            return 0;
        }
        return root.height;
        Node rightRotate(Node y){
            Node x = y.left;
            Node t2 = x.right;
            x.right = y;
            y.left = t2;
            y.height = Math.max(height(y.left),height(y.right)) + 1;
            x.height = Math.max(height(x.left),height(x.right)) + 1;
        }
        Node leftRotate(Node x){
            Node y = x.right;
            Node t2 = y.left;
            y.left = t2;
            x.right = y;
            x.height = Math.max(height(x.left),height(x.right)) + 1;
            y.height = Math.max(height(y.left),height(y.right)) + 1;
           
        }
        int getBal(Node root){
            int balance_factor = height(root.left) - height(root.right);
        }
        
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left_height = height(root.left);
        int right_height = height(root.right);
        return Math.max(left_height,right_height)+1;
    } 

    public static Node insert(Node root, int num) {
        if (root == null) {
            return new Node(num);
        } 
        else if (num < root.data) {
            root.left = insert(root.left, num);
        } 
        else {
            root.right = insert(root.right, num);
        }
        return root;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            int t = s.nextInt();
             Node root = null;

            for (int i = 0; i < t; i++) {
                int num = s.nextInt();
                root = insert(root, num);
            }
            int result[] = sum(root);
            System.out.println(Math.max(result[0], result[1]));
        }
    }
}