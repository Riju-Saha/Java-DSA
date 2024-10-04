import java.util.Scanner;

public class circularLinkedList {
    Node head;

    circularLinkedList() {
        head = null;
    }

    class Node {

        int val;
        Node next;

        Node(int value) {
            this.val = value;
            this.next = null;
        }
    }

    void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            newNode.next = head;
            curr.next = newNode;
            head = newNode; 
        }
        System.out.println("Node added at first sucessfully");
    }

    void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node currNode = head;
            while (currNode.next != head) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.next = head;
        }
        System.out.println("Node added at last sucessfully");
    }

    void addAnyPos(int value, int pos) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node currNode = head;
            int counter = 0;
            while(currNode.next != head) {
                currNode = currNode.next;
                counter++;
            }
            if(pos>counter+1) {
                System.out.println("Wrong Position");
            } else {
                if (pos == 1) {
                    addFirst(value);
                } else {
                    currNode = head;
                    for(int i=1; i<pos-1; i++) {
                        currNode = currNode.next;
                    }
                    Node temp = currNode.next;
                    currNode.next = newNode;
                    newNode.next = temp;
                }
                System.out.println("Value inserted sucessfully");
            }
        }
    }

    void deleteFirst() {
        if(head == null) {
            System.out.println("Empty list");
        } else {
            Node currNode = head;
            head = currNode.next;
            System.out.println("Value removed");
        }
    }

    void deleteLast() {
        if(head == null) {
            System.out.println("Empty list");
        } else {
            Node currNode = head;
            while (currNode.next.next != head) {
                currNode = currNode.next;
            }
            currNode.next = head;
            System.out.println("Value removed");
        }
    }

    void deleteAnyPos(int pos) {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node currNode = head;
            int counter = 0;
            while(currNode.next != head) {
                currNode = currNode.next;
                counter++;
            }
            if(pos>counter+1) {
                System.out.println("Wrong Position");
            } else {
                if (pos == 1) {
                    deleteFirst();
                } else {
                    currNode = head;
                    for(int i=1; i<pos-1; i++) {
                        currNode = currNode.next;
                    }
                    currNode.next = currNode.next.next;
                }
            }
        }
        System.out.println("Removed sucessfully");
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node currNode = head;
            do {
                System.out.print(currNode.val + " -> ");
                currNode = currNode.next;
            } while (currNode != head);
            System.out.println("Back to head (" + head.val + ")");
        }
    }

    public static void main(String[] args) {
        int num,pos;
        Scanner sc = new Scanner(System.in);
        circularLinkedList list = new circularLinkedList();

        while (true) { 
            System.out.println("1. Insert a new node at front");
            System.out.println("2. Insert a new node at back");
            System.out.println("3. Insert at any position");
            System.out.println("4. Delete node from front");
            System.out.println("5. Delete node from back");
            System.out.println("6. Delete from any position");
            System.out.println("7. Display list");
            System.out.println("9. Check next values");
            System.out.println("8. Exit");
            
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value");
                    num = sc.nextInt();
                    list.addFirst(num);
                    break;
                case 2:
                    System.out.println("Enter value");
                    num = sc.nextInt();
                    list.addLast(num);
                    break;
                case 3:
                    System.out.println("Enter value");
                    num = sc.nextInt();
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    list.addAnyPos(num, pos);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6: 
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    list.deleteAnyPos(pos);
                    break;
                case 7:
                    list.printList();
                    break;
                case 8:
                    System.out.println("Exitting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}