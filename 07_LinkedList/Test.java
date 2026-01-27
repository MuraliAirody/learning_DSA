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

    }
}
