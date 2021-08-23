public class IncrementValue {

    public static void incrementLL(Node<Integer> head){
        Node<Integer> tmp=head;
        while(tmp !=null){
            tmp.data++;
            tmp=tmp.next;
        }
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        Node<Integer> head = cl.createLL();
       incrementLL(head);
        PrintLinkedList pr= new PrintLinkedList();
       pr.printLL(head);
    }
}
