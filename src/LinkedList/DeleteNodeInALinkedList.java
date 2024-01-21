package LinkedList;

import static LinkedList.CreateLinkedList.printLinkedList;


public class DeleteNodeInALinkedList {
        public static void deleteNode(Node node) {
            Node nextNode = node.next;
            node.data = nextNode.data;
            node.next = nextNode.next;

        }

    public static void main(String[] args) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        node.next = node1;
        Node node2 = new Node(30);
        node1.next = node2;
        deleteNode(node1);
        printLinkedList(node);
    }
}
