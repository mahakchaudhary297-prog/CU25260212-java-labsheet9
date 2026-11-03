import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;

public class Labsheet9Q15 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        HashSet<String> uniqueIds = new HashSet<>();
        TreeSet<Integer> sortedIds = new TreeSet<>();

        studentList.add("Alice");
        studentList.add("Bob");
        uniqueIds.add("S101");
        uniqueIds.add("S102");
        sortedIds.add(102);
        sortedIds.add(101);

        System.out.println("ArrayList (insertion order): " + studentList);
        System.out.println("HashSet (unique IDs): " + uniqueIds);
        System.out.println("TreeSet (sorted IDs): " + sortedIds);

        ListIterator<String> iterator = studentList.listIterator();
        System.out.println("Traversing ArrayList using ListIterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
