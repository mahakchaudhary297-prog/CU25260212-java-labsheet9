import java.util.ArrayList;
import java.util.HashSet;

public class Labsheet9Q12 {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<String> patientIds = new HashSet<>();

        patientIds.add("P001");
        patientIds.add("P002");
        patientNames.add("John Doe");
        patientNames.add("Jane Smith");

        System.out.println("Patients: " + patientNames);
        System.out.println("IDs: " + patientIds);

        patientIds.remove("P001");
        patientNames.remove("John Doe");

        System.out.println("Contains P002 ID: " + patientIds.contains("P002"));
    }
}
