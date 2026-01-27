import java.util.OptionalInt;

public class LL {

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

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int val,int pos){
        if(pos==0){
            insertFirst(val);
            return;
        }
        if(pos>=size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        temp.next = new Node(val,temp.next);
        size++;
    }

    public OptionalInt deleteFirst(){
        if(head==null){
            return OptionalInt.empty();
        }
        int val = head.value;
        head = head.next;

        if(head==null){
            tail=null;
        }
        size--;
        return OptionalInt.of(val);
    }

    public OptionalInt deleteLast(){
        if(head==null){
            return OptionalInt.empty();
        }
        if (size==1){
            int val = tail.value;
            deleteFirst();
            return OptionalInt.of(val);
        }
        int val = tail.value;
        tail = getNode(size-1);
        tail.next = null;

        size--;

        return OptionalInt.of(val);
    }

    public OptionalInt deletePos(int pos){

        if (pos < 1 || pos > size) {
            throw new IndexOutOfBoundsException(
                    "Position: " + pos + ", Size: " + size
            );
        }

        if(pos==1){
            return deleteFirst();
        }

        if(pos==size){
            return deleteLast();
        }

        Node temp = getNode(pos-1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;

        return OptionalInt.of(val);
    }

    public Node findNode(int val){
        Node node = head;

        while (node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    private Node getNode(int pos){
        Node temp = head;
        for(int i=1;i<pos && temp!=null;i++){
            temp = temp.next;
        }
        return temp;
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
