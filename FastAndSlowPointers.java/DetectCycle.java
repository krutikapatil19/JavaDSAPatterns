class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class DetectCycle {

    public static boolean hasCycle (Node head ){

        //Fast and Slow pointers 
        Node slow = head;
        Node fast = head;

        //Traverse the list until fast does'nt reach null
        while(fast!= null && fast.next != null){

            //slow moves one step and Fast moves two steps at a time.
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;   //if slow and fast meets ,it means cycle exists.
        }
        return false;   //no cycle exists
    }
       public static void main(String[] args) {

        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(10);
        Node n4 = new Node(16);
        Node n5 = new Node(26);

        //Connecting the nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;

        //Check cycle
        if(hasCycle(n1))
            System.out.println("Cycle exists.");
        else
            System.out.println("Cycle does'nt exists.");
       }
    }

