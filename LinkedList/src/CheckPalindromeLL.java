public class CheckPalindromeLL {

    public static Node<Integer> getReverse(Node<Integer> head){
        Node<Integer> currentNode=head;
        Node<Integer> frwd=null;
        Node<Integer> prev=null;


        while(currentNode !=null){
            frwd=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=frwd;
        }

        return prev;
    }

    public  static boolean checkPalindrome(Node<Integer> head){
        Node<Integer> slow=head;
        Node<Integer> fast=head;
       // Node<Integer> tmp= head;
        while(fast !=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
        }

        slow= getReverse(slow);
        fast=head;

            while(slow !=null && slow.next!=null){
                if(slow.data !=fast.data){
                    return false;
                }
                slow=slow.next;
                fast=fast.next;

            }

        return true;
    }

    public static void main(String[] args) {
        CreateLinkedList cl= new CreateLinkedList();
        PrintLinkedList pl= new PrintLinkedList();
        Node<Integer> head=cl.createLL();
        System.out.println("Before");
        pl.printLL(head);
        boolean b = checkPalindrome(head);
        System.out.println(b);

    }
}
