import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Labsheet9Q9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Banana")) {
                iterator.set("Blueberry");
            }
        }

        iterator.add("Date");

        System.out.println("Updated List: " + list);
    }
}
