public class DeleteANode {

    public static Node<Integer> deleteANode(Node<Integer> head, int position) {
        if (position == 0) {
            return head.next;
        }
        if(position<0){
            return head;
        }
        Node<Integer> tmp = head;

        int i = 0;
        while (tmp != null && i < position - 1) {
            tmp = tmp.next;
            i++;
        }
        if (tmp == null  &&  tmp.next !=null) {
            return head;
        }
        tmp.next = tmp.next.next;
        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList cl= new CreateLinkedList();
        PrintLinkedList pl= new PrintLinkedList();
        Node<Integer> head=cl.createLL();
        System.out.println("Before");
        pl.printLL(head);
        System.out.println();
        int position=3;
        Node<Integer> delete = deleteANode(head, 3);
        System.out.println("After");
        pl.printLL(delete);
    }
}
