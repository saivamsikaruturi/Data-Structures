package LinkedList;


public class IntersectionPointofLL {
    public static int findIntersection(Node firstHead, Node secondHead) {

        int lenA = getLength(firstHead);
        int lenB = getLength(secondHead);

        while(lenA>lenB){
            firstHead = firstHead.next;
            lenA--;
        }

        while(lenB>lenA){
            secondHead = secondHead.next;
            lenB--;
        }


        while (firstHead != secondHead) {
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }


        return firstHead.data;


    }


    static int getLength(Node head){
        int length=0;
        while(head!=null){
            head=head.next;
            length++;
        }

        return length;

    }

    public static void main(String[] args) {

        Node head1, head2;

        /*
                Create two linked lists

                1st 3->6->9->15->30
                2nd 10->15->30

                15 is the intersection point
        */

        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;


        // Find the intersection point
        int intersectionData = findIntersection(head1, head2);
        System.out.println(intersectionData);
    }
}
