public class LengthOfLinkedList {

    public int getSize(Node<Integer> head){
        int size=0;
        Node<Integer> tmp=head;
        while(tmp !=null){
            size++;
            tmp=tmp.next;
        }
        return size;
    }

    public static void main(String[] args) {
        CreateLinkedList cl= new CreateLinkedList();
        Node<Integer> head = cl.createLL();
        LengthOfLinkedList ll=new LengthOfLinkedList();
        int size =ll.getSize(head);
        System.out.println(size);
    }
}
