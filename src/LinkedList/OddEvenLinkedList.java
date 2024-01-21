package LinkedList;

import static LinkedList.CreateLinkedList.printLinkedList;


public class OddEvenLinkedList {
    public static Node oddEvenList(Node head) {

        if(head==null){
            return null;
        }

        Node odd = head;
        Node even = head.next;

        Node evenHead=even;

        while(even!=null && even.next!=null){

            odd.next = odd.next.next;
            odd=odd.next;

            even.next=even.next.next;
            even = even.next;


        }

        odd.next=evenHead;
        return head;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        printLinkedList(node);
        System.out.println();
        Node head = oddEvenList(node);
        System.out.println("after segregating::");
        printLinkedList(head);
    }
}
