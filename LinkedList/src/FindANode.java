public class FindANode {
    public static void getNode(Node<Integer> head,int i){

        int position=0;
        Node<Integer> tmp= head;
        while(tmp !=null && position <i){
            position++;
            tmp=tmp.next;

        }

         if(tmp!=null){
             System.out.println(tmp.data);
         }
    }

    public static void main(String[] args) {
        CreateLinkedList cl= new CreateLinkedList();
        Node<Integer> head = cl.createLL();
        getNode(head,3);
    }

}
