
public class linkedlist {

   static class node {

    int data;
    node next;

    // constructor in its class only
    node(int data) {

      this.data = data;
      this.next = null;
    }
  }

  public static node head;
  public static node tail;
  public static int size;

  // add at first method

  static void addingAtfirst(int data) {

    node newNode = new node(data);
    size++;
    // if list is empty
    if (head == null) {
      head = tail = newNode;
      return;
    } else {
      // if add element at first
      newNode.next = head;
      head = newNode;
    }
  }

  // adding at last method

  static void addingAtlast(int data) {

    node newNode = new node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  // adding at middle method

  public static void addingAtmiddle(int index, int data) {

    node newNode = new node(data);
    size++;
    node temp = head;
    int i = 0; // temp index posistion
    while (i < index - 1) {
      temp = temp.next;
      i++;
    }
    // i = index-1; temp = prev
    newNode.next = temp.next;
    temp.next = newNode;
  }

  // remove from first method

  public static int removeFirst() {

    if (head == null) {
      System.out.println("Nothing to be remove list is empty");
      return Integer.MIN_VALUE;
    }
    int val = head.data;
    size--;
    head = head.next;
    return val;
  }

  // remove from last method

  static int removeLast() {

    if (head == null) {
      System.out.println("Nothing to be remove list is empty");
      return Integer.MIN_VALUE;
    }

    node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }

    int val = prev.next.data;
    size--;
    prev.next = null;
    tail = head;
    return val;
  }

  // search the element method

  static int searchElement(int key) {
    node temp = head;
    int i = 0;

    while (temp != null) {
      if (temp.data == key) { // if found
        return i;
      }
      temp = temp.next;
      i++;
    }

    // not found
    return -1;
  }

  // helper recursive method // o(n)
  public static int Helper(node head, int key) {

    // base case
    if (head == null) {
      return -1;
    }

    // recursive cases
    if (head.data == key) {
      return 0;
    }

    int index = Helper(head.next, key);
    if (index == -1) { // if not
      return -1;
    } else
      return index + 1;
  }

  // search the element by recursion method

  static int recursionSearchElement(int key) {
    return Helper(head, key);
  }

  // print the linkedlist method

  static void printLinkedlist() {
    if (head == null) {
      System.out.println("List is empty");
    }
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println("null");
  }

  @SuppressWarnings("static-access")
  public static void main(String[] args) {

    linkedlist ll = new linkedlist();

    ll.addingAtfirst(5);
    ll.addingAtfirst(50);
    ll.addingAtlast(19);
    ll.addingAtlast(40);

    ll.printLinkedlist();

  }
}
