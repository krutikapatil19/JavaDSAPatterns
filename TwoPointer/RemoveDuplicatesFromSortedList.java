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

        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val) {
                //remove duplicate val
                current.next = current.next.next;
                //if current element is same as the element at current.next , then remove the duplicate ,i.e current.next = current.next.next
            } else {
                //move forward
                current = current.next;
        }
    }
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode (1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);

        head = removeDuplicates(head);
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
