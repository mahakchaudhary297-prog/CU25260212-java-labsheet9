import java.util.TreeSet;

public class Labsheet9Q11 {
    public static void main(String[] args) {
        TreeSet<Integer> studentIds = new TreeSet<>();
        studentIds.add(102);
        studentIds.add(105);
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(108);
        studentIds.add(105);

        System.out.println("Unique Sorted IDs: " + studentIds);
        System.out.println("First: " + studentIds.first());
        System.out.println("Last: " + studentIds.last());
        System.out.println("Higher than 102: " + studentIds.higher(102));
        System.out.println("Lower than 105: " + studentIds.lower(105));
    }
}
