import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

       
        Queue<String> students = new LinkedList<>();

   
        students.offer("Ana");
        students.offer("Ben");
        students.offer("Carla");

        System.out.println("Initial Queue: " + students);

        System.out.println("\nService Order:");

        while (!students.isEmpty()) {
            String student = students.poll();

            System.out.println(student + " is being served.");
        }
    }
}