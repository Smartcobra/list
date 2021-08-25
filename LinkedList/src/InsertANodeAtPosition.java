public class InsertANodeAtPosition {

    public static Node<Integer> insert(Node<Integer> head, int position, int data) {

        Node<Integer> newNode = new Node<Integer>(data);

        int i = 0;
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }

        Node<Integer> tmp = head;
        while (tmp != null && i < (position - 1)) {
            tmp = tmp.next;
            i++;
        }
        if (tmp == null) {
            return head;
        }
        newNode.next = tmp.next;
        tmp.next = newNode;
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
        int dat=7;
        Node<Integer> insert = insert(head, 3, 11);
        System.out.println("After");
        pl.printLL(insert);

    }

}
