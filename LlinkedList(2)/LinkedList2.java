class Node {
    int data;
    Node next;
}

class LinkedList2 {
    Node head;
    //creates a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    //creates a new node at the end of the list
    public void insertAtEnd(int data) {
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
    //creates a new note after the given node
    public void insertAfter(Node previous, int data) {
        if (previous == null)
            return;
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = previous.next;
        previous.next = newNode;
    }
    //deletes the first node
    public void deleteFirst() {
        if (head == null)
            return;
        head = head.next;
    }
    //deletes the last node
    public void deleteLast() {
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

    //finds the node with the given data and deletes it
    public void deleteAny(int data) {
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
        LinkedList2 list = new LinkedList2();
        // Insert some values at the beginning of the list
        list.insertAtBeginning(4);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        // Print the list
        list.printList();
        // Insert a new value at the end of the list
        list.insertAtEnd(5);
        // Print the updated list
        list.printList();
        // Insert a new value after the second node
        list.insertAfter(list.head.next, 6);
        // Print the updated list
        list.printList();
        // Delete the first node
        list.deleteFirst();
        // Print the updated list
        list.printList();
        // Delete the last node
        list.deleteLast();
        // Print the updated list
        list.printList();
        // Delete a node with a given value
        list.deleteAny(3);
        // Print the updated list
        list.printList();
    }
}

/*
    1. Define a Node class with fields for data and a reference to the next node.
    2. Define a LinkedList class with methods for inserting at the beginning, end, and after a given node, deleting the first, last, and any node with a given value, and printing the list.
    3. In the main method:
            Create a new LinkedList object.
            Use the insertAtBeginning method to add some values to the beginning of the list.
            Use the printList method to print the list.
            Use the insertAtEnd method to add a new value to the end of the list.
            Use the printList method to print the updated list.
            Use the insertAfter method to add a new value after a given node.
            Use the printList method to print the updated list.
            Use the deleteFirst method to delete the first node of the list.
            Use the printList method to print the updated list.
            Use the deleteLast method to delete the last node of the list.
            Use the printList method to print the updated list.
            Use the deleteAny method to delete a node with a given value.
            Use the printList method to print the updated list.
    4. End the program.
 */