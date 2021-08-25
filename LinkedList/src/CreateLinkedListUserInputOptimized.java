import java.util.Scanner;

public class CreateLinkedListUserInputOptimized {


    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);

            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = sc.nextInt();
        }

        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        PrintLinkedList pr=new PrintLinkedList();
        pr.printLL(head);
    }
}
