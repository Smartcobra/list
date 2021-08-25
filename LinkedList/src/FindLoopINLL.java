import java.util.HashSet;
import java.util.Set;

public class FindLoopINLL {

    public static boolean checkCircular(Node<Integer> head) {
        Set<Node<Integer>> set = new HashSet<Node<Integer>>();
        Node<Integer> tmp = head;

        while (tmp != null) {
            if (!set.contains(tmp)) {
                set.add(tmp);
                tmp = tmp.next;
            } else {
                return true;
            }
        }
        return false;
    }

    ///fast way
    public static boolean floydAlgo(Node<Integer> head) {
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        int flag = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        Node<Integer> head1 = cl.createLL();
        Node<Integer> head2 = cl.createLoopLL();
        PrintLinkedList pl = new PrintLinkedList();
        pl.printCircularLL(head2);
        System.out.println(checkCircular(head2));
       // System.out.println(checkCircular(head1));
        System.out.println(floydAlgo(head2));


    }
}
