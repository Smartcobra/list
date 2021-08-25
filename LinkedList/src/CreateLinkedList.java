public class CreateLinkedList {
    static Node head;
    public Node<Integer> createLL() {
        //use this for Palindrome
       /* Node<Integer> n1; //this is the reference but not the actual node
        n1 = new Node<Integer>(1);  //assigning here
        Node<Integer> n2 = new Node<Integer>(2);
        Node<Integer> n3 = new Node<Integer>(3);
        Node<Integer> n4 = new Node<Integer>(4);
        Node<Integer> n5 = new Node<Integer>(3);
        Node<Integer> n6 = new Node<Integer>(2);
        Node<Integer> n7 = new Node<Integer>(1);*/


     /*  Node<Integer> n1; //this is the reference but not the actual node
        n1 = new Node<Integer>(2);  //assigning here
        Node<Integer> n2 = new Node<Integer>(3);
        Node<Integer> n3 = new Node<Integer>(4);
        Node<Integer> n4 = new Node<Integer>(5);
        Node<Integer> n5 = new Node<Integer>(6);
        Node<Integer> n6 = new Node<Integer>(7);
        Node<Integer> n7 = new Node<Integer>(8);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;*/

        //use this for loop check;
        Node<Integer> n1; //this is the reference but not the actual node
        n1 = new Node<Integer>(2);  //assigning here
        Node<Integer> n2 = new Node<Integer>(3);
        Node<Integer> n3 = new Node<Integer>(4);
        Node<Integer> n4 = new Node<Integer>(5);
        Node<Integer> n5 = new Node<Integer>(6);
        Node<Integer> n6 = new Node<Integer>(7);
        Node<Integer> n7 = new Node<Integer>(8);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;
            n6.next = n7;

       return n1;
    }

     public Node<Integer> createLoopLL()
    {
        Node head = new Node(2);
        Node new_node1 = new Node(3);
        Node new_node2 = new Node(4);
        Node new_node3 = new Node(5);
        Node new_node4 = new Node(6);

        head.next =new_node1;
        new_node1.next =new_node2;
        new_node2.next = new_node3;
        new_node3.next=new_node4;
        head.next.next.next.next = head;
        return head;


    }

}
