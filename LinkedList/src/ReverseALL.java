public class ReverseALL {

    public static  Node<Integer> getReverseLL(Node<Integer> head){

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

    public static void main(String[] args) {
        CreateLinkedList cl= new CreateLinkedList();
        PrintLinkedList pl= new PrintLinkedList();
        Node<Integer> head=cl.createLL();
        System.out.println("Before");
        pl.printLL(head);
        Node<Integer> reverseLL = getReverseLL(head);
        System.out.println("After");
        pl.printLL(reverseLL);
    }

}
