class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReorderLinkedList {

    public static void reorderList(Node head){

        //When list is empty or only 1 node , nothing to do 
        if(head == null || head.next == null) return;

        //Step1: Find Middle 
        Node slow = head;
        Node fast = head;

        //Slow moves 1 step , fast moves 2 steps
        //when fast reaches end ,slow is at middle 
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //Step 2: Reverse second half 
        Node prev = null;
        Node curr = slow.next;

        //break the list into two halves 
        slow.next = null;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Step 3: Merge both halves
        Node first = head;
        Node second = prev;

        while(second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        reorderList(n1);

        printList(n1);
    }
}

