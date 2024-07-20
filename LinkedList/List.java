
import java.util.Scanner;
public class List {
    static Node head;
    static int size;

    public List() {
        size = 0;
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
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

    static void insertAtPos(int val, int index) {
        Node newNode = new Node(val);
        if (index <= 0 || index >= size) {
            System.out.println("Invalid Index!");
            return;
        }
        if (index == 1 || head == null) {
            insertAtBeg(val);
            return;
        }

        Node nextNode = head.next;
        Node prev = head;

        for (int i=1; i<index-1; i++) {
            nextNode = nextNode.next;
            prev = prev.next;
        }

        newNode.next = nextNode;
        prev.next = newNode;
    }

    static void deleteAtBeg() {
        if (head == null) {
            return;
        }

        head = head.next;
        size--;
        displayList();
    }

    static void deleteAtEnd() {
        if (head == null) {
            displayList();
            return;
        }

        Node nextNode = head.next;
        Node prev = head;

        if (nextNode == null) {
            deleteAtBeg();
            size--;
            return;
        }
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            prev = prev.next;
        }

        prev.next = null;
        size--;
        displayList();
    }

    static void deleteAtPos(int index) {
        if (index <= 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 1) {
            deleteAtBeg();
            size--;
            return;
        }
        if (index == size) {
            deleteAtEnd();
            size--;
            return;
        }

        Node track = head;
        for (int i=1; i<index-1; i++) {
            track = track.next;
        }

        track.next = track.next.next;
        size--;
    }
  
    static void displayList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.insertAtBeg\n2.insertAtEnd\n3.displayList\n4.Delete at Begining\n5. Delete at End\n6.Insert at Index\n7.Delete At index\nEnter choise : ");
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
                displayList();
            } else if(choise == 4) {
                deleteAtBeg();
            } else if(choise == 5) {
                deleteAtEnd();
            } else if (choise == 6) {
                System.out.println("Enter a number into the list : ");
                int num = scan.nextInt();
                System.out.println("Enter the position : ");
                int pos = scan.nextInt();
                insertAtPos(num, pos);
            } else if (choise == 7) {
                System.out.println("Enter the index : ");
                int pos = scan.nextInt();
                deleteAtPos(pos);
            }
            else {
                System.out.println("Entered Wrong choise! \nProgram terminated!");
                break;
            }
        }

        scan.close();
    }
}