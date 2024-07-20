import java.util.LinkedList;
import java.util.Scanner;
public class List {
    static Node head;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

    }

    static void displayList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List list = new List();

        while (true) {
            System.out.println("\n1.insertAtBeg\n2.insertAtEnd\n3.displayList\nEnter choise : ");
            int choise = scan.nextInt();
            if (choise == 1) {
                System.out.println("Enter a number into the list: ");
                int num = scan.nextInt();
                insertAtBeg(num);
            } else if (choise == 2) {
                System.out.println("Enter a number into the list: ");
                int num = scan.nextInt();
                insertAtEnd(num);
            } else if (choise == 3) {
                displayList(head);
            } else {
                System.out.println("Program terminated!");
                break;
            }
        }
    }
}