public class circularQueue {

  public static class mycircularQueue {
    static int arr[];
    static int front, rear, capacity, size;

    public mycircularQueue(int capacity) {

      this.capacity = capacity;
      arr = new int[capacity];
      front = -1;
      rear = -1;
      size = 0;
    }

    // enqueue the element
    public static void enqueue(int data) {
      if (isFull()) {
        System.out.println("Queue is full ");
        return;
      }
      if (isEmpty()) {
        front = 0;
      }
      rear = (rear + 1) % capacity;
      arr[rear] = data;
      size++;

    }

    // dequeue the element
    public static int dequeue() {
      if (isEmpty()) {
        System.out.println("Queue is empty ");
        return -1;
      }
      int data = arr[front];
      if (front == rear) { // if queue has only one element
        front = -1;
        rear = -1;
      } else {
        front = (front + 1) % capacity;
      }
      size--;
      return data;
    }

    // peek the element
    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty ");
        return -1;
      }
      return arr[front];
    }

    // isEmpty
    public static boolean isEmpty() {
      return size == 0;
    }

    // isFull
    public static boolean isFull() {
      return size == capacity;
    }

    // getsize
    public static int getSize() {
      return size;
    }

    // printQueue
    public static void printQueue() {
      if (isEmpty()) {
        System.out.println("Your queue is empty");
      }
      int count = size;
      int i = front;
      while (count > 0) {
        System.out.print(arr[i] + " ");
        i = (i + 1) % capacity;// Move to the next element in a circular way
        count--;
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {

    mycircularQueue cq = new mycircularQueue(4);

    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);
    cq.enqueue(50);

    System.out.println(cq.getSize());
    System.out.println(cq.peek());

    cq.printQueue();

  }

}
