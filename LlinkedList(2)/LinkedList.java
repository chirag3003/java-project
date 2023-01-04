class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    // creates a new node at the end of the list
    public void insert(int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            current.next = newNode;
        }
    }

    // deletes the last node
    public void delete() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // joins two list together
    public void joinList(LinkedList list) {
        if (head == null) {
            head = list.head;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list.head;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        // inserting elements in the first List
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        // display first list
        System.out.println("First List: ");
        list1.printList();

        LinkedList list2 = new LinkedList();
        // inserting elements in the second List
        list2.insert(5);
        list2.insert(6);
        list2.insert(7);
        // display second list
        System.out.println("Second List: ");
        list2.printList();

        // joining two lists
        list1.joinList(list2);
        System.out.println("Joined List: ");
        list1.printList();
    }
}

/*
 * 1. Define a Node class with fields for data and a reference to the next node.
 * 2. Define a LinkedList class with methods for inserting a node, deleting a
 * node, joining two lists and printing the list.
 * 3. In the main method:
 * Create a new LinkedList object.
 * Use the insert method to add some values to the list.
 * Use the printList method to print the list.
 * Create a second list
 * Use the insert method to insert some values to the second list.
 * Use the printList method to print the second list.
 * Use the joinList method to join the second list in the first.
 * Use the printList method to print the updated first list.
 * 4. End the program.
 */