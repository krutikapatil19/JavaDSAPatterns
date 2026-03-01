//Node structure
class ListNode {
    int val;
    ListNode next;

    ListNode (int val) {
        this.val = val;
        this.next = null;
    }
}
public class RemoveDuplicatesFromSortedList {

    public static ListNode removeDuplicates (ListNode head){

        //start from head
        ListNode current = head;

        //traverse list until last node

        while(current != null && current.next != null){

            //if current value and next value are same 
            if(current.val == current.next.val) {
                //remove duplicate by skipping next node
                current.next = current.next.next;
                //if current element is same as the element at current.next , then remove the duplicate ,i.e current.next = current.next.next
            } else {

                //if not duplicate, move forward
                current = current.next;
        }
    }
        //return updated head
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode (1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);

        //call function to remove duplicates
        head = removeDuplicates(head);

        //print updated list
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
