public class QueueBylinkedlist {

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static node head = null;
        static node tail = null;

        // isEmpty method
        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        // add element method
        public static void add(int data) {
            node newNode = new node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove element method
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Nothing to remove queue is null");
                return -1;
            }
            int front = head.data;
            // for single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek method
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            return head.data;
        }

        // printQueue method
        public static void printQueue() {
            node temp = head;
            if (temp == null) {
                System.out.println("Queue is empty ");
                return;
            }
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);

        q.remove();

        q.printQueue();

    }

}
