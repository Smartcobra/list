public class PrintLinkedList {

    public  void printLL(Node<Integer> head) {
        Node<Integer> tmp = head; //why we are not taking head directly for the printing//if we want head in another function it will not work because it already reach to the null.
        while (tmp != null) {
            System.out.print(tmp.data);
            tmp = tmp.next;

        }
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        Node<Integer> head = cl.createLL();
        PrintLinkedList pr=new PrintLinkedList();
        pr.printLL(head);

    }
}
