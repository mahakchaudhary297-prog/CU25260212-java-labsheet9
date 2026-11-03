import java.util.LinkedList;

public class Labsheet9Q8 {
    public static void main(String[] args) {
        LinkedList<String> labQueue = new LinkedList<>();
        labQueue.addLast("Student1");
        labQueue.addLast("Student2");
        labQueue.addFirst("PriorityStudent");

        System.out.println("Queue: " + labQueue);

        labQueue.removeFirst();
        labQueue.removeLast();

        System.out.println("Queue after removals: " + labQueue);
    }
}
