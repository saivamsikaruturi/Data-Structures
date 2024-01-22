package LinkedList;


public class RemoveDuplicatesFormLL {
    Node removeDuplicates(Node head)
    {

        Node prev = head;
        Node temp = prev.next;

        while(temp!=null){

            if(prev.data==temp.data){
                temp = temp.next;
                continue;
            }

            prev.next = temp;
            prev = temp;
            temp=temp.next;

        }

        prev.next = null;
        return head;
    }
}
