class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class StartOfLinkedListCycle {
    
    public static Node startOfCycle (Node head){

        
        //Initialize Fast and slow pointers
        Node slow = head;
        Node fast = head;

        //Move pointers to detect cycle
        while(fast!=null && fast.next != null){

            slow = slow.next;       //move slow by one step
            fast = fast.next.next;  //move fast by two steps

            //If they meet, cycle exists
            if(slow == fast) {

                //Create a new pointer from head 
                Node temp = head;

            //moving both pointers by 1 step
            while(temp !=slow){
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
    }
    return null;
    }
    public static void main(String[] args){

        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(10);
        Node n4 = new Node(16);
        Node n5 = new Node(26);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;

        Node result = startOfCycle(n1);

        if(result!=null){
            System.out.println("Start Of Cycle : " + result.val);
        }else{
            System.out.println("No Cycle");
        }
    }
}
