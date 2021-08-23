public class CreateLinkedList {

    public  Node<Integer> createLL() {
        Node<Integer> n1; //this is the reference but not the actual node
        n1 = new Node<Integer>(2);  //assigning here
        Node<Integer> n2 = new Node<Integer>(3);
        Node<Integer> n3 = new Node<Integer>(4);
        Node<Integer> n4 = new Node<Integer>(5);
        Node<Integer> n5 = new Node<Integer>(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }

}
