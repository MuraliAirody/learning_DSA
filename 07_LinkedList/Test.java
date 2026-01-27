import java.util.OptionalInt;

public class Test {
    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(1);

        list.insertLast(100);
        list.insertFirst(0);
        list.insertLast(101);

        list.insert(11,3);

        list.display();


    }
}
