package LinkedList;


public class PalindromeLL {
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null){
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;
        while(slow!=null){
            if(fast.data==slow.data){
                fast=fast.next;
                slow = slow.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static Node reverseList(Node head) {
        Node prevNode = null;
        Node currentNode = head;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next= prevNode;
            prevNode = currentNode;
            currentNode= nextNode;
        }
        head = prevNode;

        return head;
    }
}
