package LinkedList;


public class lengthofLL {
    public static int length(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){

            count++;

            temp = temp.next;

        }
        return count;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        node.next = node1;
        Node node2 = new Node(30);
        node1.next = node2;
        System.out.println(length(node));
    }
}
