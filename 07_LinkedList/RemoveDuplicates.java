class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicates {

    private ListNode head;
    private ListNode tail;

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

    }

    public void display() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        if(head!=null) {
            System.out.print("end\n");
        }
    }

    public void removeDuplicate() {

        if (head == null) return;

        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {
            if (first.val == second.val) {
                second = second.next;
                first.next = second;
            } else {
                first = second;
                second = second.next;
            }
        }
        tail = first;
    }


    public static void main(String[] args) {

        RemoveDuplicates list = new RemoveDuplicates();

        list.insertFirst(4);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);

        list.display();

        list.removeDuplicate();

        list.display();

        System.out.println(list.tail.val);



    }

}
