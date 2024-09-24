import java.util.Comparator;
import java.util.PriorityQueue;


public class MyPriority {

    public static class Politicians implements Comparable<Politicians> { // Override

        String name;
        int vots;

        Politicians(String name, int vots) {
            this.name = name;
            this.vots = vots;

        }

        @Override
        public int compareTo(Politicians p2) {
            return this.vots - p2.vots;
        }

    }

    public static void main(String[] args) {

        PriorityQueue<Politicians> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Politicians(" BJP ", 485));
        pq.add(new Politicians(" AAP ", 1587));
        pq.add(new Politicians(" INC ", 152));
        pq.add(new Politicians(" NCP ", 59));

        while (!pq.isEmpty()) {

            System.out.print(pq.peek().name + " -> " + pq.peek().vots);
            pq.remove();
            System.out.println();
        }

    }
}
