public class RecursiveInsertionLL {

    private Node head;
    private Node tail;

    private int size;

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    private Node recInsertion(int pos, int val, Node current){
        if(pos==1){
            Node node = new Node(val,current);
            size++;
            if(node.next==null){
                tail = node;
            }
            return node;
        }
        current.next = recInsertion(pos-1,val, current.next);

        return current;
    }

    public void recInsertion(int pos,int val){
        if(pos<1 || pos>size+1){
           throw new IndexOutOfBoundsException( "Position: " + pos + ", Size: " + size);
        }
        head = recInsertion(pos,val,head);
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        if(head!=null) {
            System.out.print("end\n");
        }
    }

}
