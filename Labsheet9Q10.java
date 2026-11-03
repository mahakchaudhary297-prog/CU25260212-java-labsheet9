import java.util.ArrayList;
import java.util.HashSet;

public class Labsheet9Q10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int[] values = {10, 20, 10, 30, 20, 40};
        for (int v : values) {
            arrayList.add(v);
            hashSet.add(v);
        }

        System.out.println("ArrayList (allows duplicates, preserves order): " + arrayList);
        System.out.println("HashSet (no duplicates, unordered): " + hashSet);
    }
}
