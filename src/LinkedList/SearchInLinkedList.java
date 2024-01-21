package LinkedList;


public class SearchInLinkedList {
    public static int searchInLinkedList(Node head, int k)
    {
        Node temp = head;

        while(temp!=null){

            if(temp.data==k)
            {
                return 1;
            }

            temp=temp.next;

        }
        return 0;



    }

    public static void main(String[] args) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        node.next = node1;
        Node node2 = new Node(30);
        node1.next = node2;
        System.out.println(searchInLinkedList(node,20));
    }
}
