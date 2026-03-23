class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
    public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            //when fast = null or fast.next = null  ,then slow is at the middle 
            //reverse the linkedlist from middle 
        }

        if(fast != null){
        slow = slow.next;
        }
        
        Node prev = null;
        Node curr = slow;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node first = head;
        Node second = prev;

        while(second != null){
            if(first.val != second.val){
        return false;
         }
            first = first.next;
            second = second.next;
        }

        return true;
        }
        public static void main(String[] args){

            Node n1 = new Node(2);
            Node n2 = new Node(5);
            Node n3 = new Node(10);
            Node n4 = new Node(12);
            Node n5 = new Node(15);

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;

            System.out.println(isPalindrome(n1));
        }
    }
