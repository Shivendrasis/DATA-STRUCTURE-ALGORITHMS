/**
 * Queue
 */
public class Queue {

    static public class myQueue {
        static int arr[];
        static int rear;
        static int size;

        myQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty method
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add method
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return; // Add this return statement
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove method
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek method
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {

        myQueue q = new myQueue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.add(5);
        q.remove();
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}