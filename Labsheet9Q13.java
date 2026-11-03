import java.util.ArrayList;
import java.util.ListIterator;

public class Labsheet9Q13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("Physics");
        courses.add("Chemistry");
        courses.add("Biology");
        courses.add("Computer Science");

        ListIterator<String> it = courses.listIterator();
        System.out.println("Forward traversal:");
        while (it.hasNext()) {
            System.out.println("Index: " + it.nextIndex() + ", Value: " + it.next());
        }

        System.out.println("Backward traversal:");
        while (it.hasPrevious()) {
            System.out.println("Index: " + it.previousIndex() + ", Value: " + it.previous());
        }
    }
}
