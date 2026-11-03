import java.util.ArrayList;

public class Labsheet9Q3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Anjali");
        students.add("Ravi");
        students.add("Kajal");
        students.add("Muskan");
        students.add("Chitra");

        students.set(1, "Muskan");
        students.remove(3);

        for (String s : students) {
            System.out.println(s);
        }
    }
}
