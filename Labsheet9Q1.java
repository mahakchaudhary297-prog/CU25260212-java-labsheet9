import java.util.ArrayList;

public class Labsheet9Q1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Anjali");
        students.add("Sushma");
        students.add("Kumkum");
        students.add("Chitra");
        students.add("Kajal");
        students.add("Muskan");
        students.add("Harsh");
        students.add("Priyanshu");
        students.add("Abhinav");
        students.add("Ravi");

        for (String name : students) {
            System.out.println(name);
        }
        System.out.println("Total size: " + students.size());
    }
}
