class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class MiddleOfTheLinkedList {

    public static Node FindMiddle( Node head) {

        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(10);
        Node n4 = new Node(12);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(FindMiddle(n1).val);
    }
}
