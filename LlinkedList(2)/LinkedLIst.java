class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void append(int data) {
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

    public void prepend(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void deleteWithValue(int data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add some values to the list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        // Print the list
        list.printList();

        // Prepend a new value to the list
        list.prepend(0);

        // Print the updated list
        list.printList();

        // Delete a value from the list
        list.deleteWithValue(2);

        // Print the updated list
        list.printList();
    }
}

/*
    1.Define a Node class with fields for data and a reference to the next node.
    2.Define a LinkedList class with methods for appending, prepending, deleting, and printing nodes.
    3.In the main method:
        Create a new LinkedList object.
        Add some values to the list using the append method.
        Print the list using the printList method.
        Add a new value to the beginning of the list using the prepend method.
        Print the updated list using the printList method.
        Delete a value from the list using the deleteWithValue method.
        Print the updated list using the printList method.
    4.End the program.
 */