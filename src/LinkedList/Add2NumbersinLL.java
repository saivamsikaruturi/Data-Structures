package LinkedList;


public class Add2NumbersinLL {
     
        public Node addTwoNumbers(Node l1, Node l2) {
            Node result = new Node(0);
            Node ptr = result;
            int carry = 0;
            while(l1!=null || l2!=null){
                int sum = carry+0;
                if(l1!=null){
                    sum+=l1.data;
                    l1=l1.next;
                }
                if(l2!=null){
                    sum+=l2.data;
                    l2=l2.next;
                }

                carry = sum/10;
                sum = sum%10;
                ptr.next = new Node(sum);
                ptr = ptr.next;

            }

            if(carry == 1){
                ptr.next = new Node(carry);
            }

            return result.next;
        
    }
}
