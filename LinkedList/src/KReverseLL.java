public class KReverseLL {

    public static Node<Integer> getKReverseLL(Node<Integer> head, int k) {

        Node<Integer> currentNode = head;
        Node<Integer> prev = null;
        Node<Integer> frwd = null;

        int count = 0;
        while (currentNode != null && count <= k) {
            frwd = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = frwd;
            count++;
        }

        if (frwd != null) {
            head.next = getKReverseLL(frwd, k);
        }
        return prev;
    }

    public static void main(String[] args) {
        CreateLinkedList cl= new CreateLinkedList();
        PrintLinkedList pl= new PrintLinkedList();
        Node<Integer> head=cl.createLL();
        System.out.println("Before");
        pl.printLL(head);
        Node<Integer> c = getKReverseLL(head,3);
        System.out.println("After");
        pl.printLL(c);
    }

}
