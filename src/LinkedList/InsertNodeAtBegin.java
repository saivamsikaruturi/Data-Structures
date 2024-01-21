package LinkedList;

import static LinkedList.CreateLinkedList.printLinkedList;


public class InsertNodeAtBegin {
    public static Node insertAtFirst(Node list, int newValue) {

        Node newNode = new Node(newValue);
        newNode.next = list;

        return newNode;

    }

    public static void main(String[] args) {
        Node node = new Node(10);
        Node insertAtFirst = insertAtFirst(node, 100);
        printLinkedList(insertAtFirst);
    }
}
