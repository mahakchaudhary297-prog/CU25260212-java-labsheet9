import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Labsheet9Q14 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        arrayList.remove(1);
        linkedList.remove(1);

        System.out.println("ArrayList size: " + arrayList.size() + ", element at 0: " + arrayList.get(0));
        System.out.println("LinkedList size: " + linkedList.size() + ", element at 0: " + linkedList.get(0));
    }
}
