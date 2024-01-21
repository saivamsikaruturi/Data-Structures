package LinkedList;


public class CreateLinkedList {

        public static Node constructLL(int []arr) {

            if (arr == null || arr.length == 0) {
                return null;
            }

            // Create the head node
            Node head = new Node(arr[0]);
            Node current = head;

            // Iterate over the array to create the linked list
            for (int i = 1; i < arr.length; i++) {
                Node newNode = new Node(arr[i]);
                current.next = newNode;
                current = newNode;
            }

            return head;


        }

    public static void main(String[] args) {
        Node node = constructLL(new int[]{1, 2, 3, 4, 5});
        printLinkedList(node);
    }

    public static void printLinkedList(Node node) {
        while (node !=null){
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
}
