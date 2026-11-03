import java.util.ArrayList;
import java.util.Scanner;

public class Labsheet9Q6 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java Programming");
        courses.add("Data Structures");
        courses.add("Database Systems");
        courses.add("Web Development");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name to search: ");
        String searchCourse = scanner.nextLine();

        if (courses.contains(searchCourse)) {
            System.out.println("Course exists in the list.");
        } else {
            System.out.println("Course does not exist in the list.");
        }
        scanner.close();
    }
}
