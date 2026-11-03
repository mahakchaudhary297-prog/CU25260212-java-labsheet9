import java.util.HashSet;

public class Labsheet9Q4 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        departments.add("Computer Science");
        departments.add("Mathematics");
        departments.add("Physics");
        departments.add("Computer Science");
        departments.add("Chemistry");
        departments.add("Mathematics");

        for (String dept : departments) {
            System.out.println(dept);
        }
    }
}
