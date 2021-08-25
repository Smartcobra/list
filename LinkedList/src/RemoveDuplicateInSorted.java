public class RemoveDuplicateInSorted {

    public static Node<Integer> removeDuplicate(Node<Integer> head) {
        Node<Integer> current_node = head;
        Node<Integer> current_node_next = null;

        while (current_node.next != null ) {
            current_node_next = current_node.next;
            if (current_node.data == current_node_next.data) {
                current_node.next = current_node_next.next;
            }else{
                current_node = current_node.next;
            }

        }

        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList cl= new CreateLinkedList();
        PrintLinkedList pl= new PrintLinkedList();
        Node<Integer> head = cl.createLL();
        System.out.println("Before");
        pl.printLL(head);
        System.out.println("After");
        Node<Integer> head1 = removeDuplicate(head);
        pl.printLL(head1);

    }
}
