import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q);
        q.offer(12);
        q.offer(13);
        System.out.println(q);
    }
}
