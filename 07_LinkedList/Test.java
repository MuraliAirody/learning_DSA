import java.util.OptionalInt;

public class Test {
    public static void main(String[] args) {

        RecursiveInsertionLL list = new RecursiveInsertionLL();

        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertFirst(0);

        list.display();

        list.recInsertion(6,20);

        list.display();


        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);

        LL list2 = new LL();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);


        LL ans = new LL().mergeTwoSortedList(list1,list2);

        ans.display();
    }
}
