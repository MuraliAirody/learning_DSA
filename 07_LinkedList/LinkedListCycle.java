
public class LinkedListCycle {

    private ListNode head;
    private ListNode tail;

    // Insert at end
    public void insert(int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    // Create a cycle: tail -> node at position pos (1-based)
    public void createCycle(int pos) {
        if (pos <= 0) return;

        ListNode temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            tail.next = temp;
        }
    }

    // Floyd’s Cycle Detection
    public boolean hasCycle() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Find start of cycle
    public ListNode detectCycleStart() {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null; // no cycle
        }

        // Step 2: find entry point
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        LinkedListCycle list = new LinkedListCycle();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);


        // Create cycle: tail -> node with value 3
        list.createCycle(4);

        System.out.println("Cycle present: " + list.hasCycle());

        ListNode cycleStart = list.detectCycleStart();
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle found");
        }
    }
}
