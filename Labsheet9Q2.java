import java.util.ArrayList;

public class Labsheet9Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(88);

        System.out.println("First element: " + marks.get(0));
        System.out.println("Middle element: " + marks.get(marks.size() / 2));
        System.out.println("Last element: " + marks.get(marks.size() - 1));
    }
}
