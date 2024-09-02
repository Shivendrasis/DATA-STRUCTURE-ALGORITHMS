public class DoublyLinkedList {

    static class node{
        int data;
        node next;
        node prev;

        node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static node head;
    public static node tail;

    static void insertFirst(int data){
        node newNode = new node(data);
        if(head == null){
           head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    static void insertLast(int data){
        node newNode = new node(data);

        if(tail == null){
            tail = head = newNode;
        }
        
        newNode.next = tail;
        tail.prev = newNode;
        tail = newNode; 


    }


    static int removeFirst(){
        //corner case 
        if(head == null){
            System.out.println("Nothing to remove list is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }


    static void reverseList(){
        node temp = head;
        node next ;
        node prev = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            temp.prev= next;

            prev = temp;
            temp = next;
        }
        head = prev;
    }


    static void printData(){
       node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        DoublyLinkedList DLL = new DoublyLinkedList();

        DLL.insertFirst(5);
        DLL.insertFirst(4);
        DLL.insertFirst(3);
        DLL.insertFirst(2);
        DLL.insertFirst(1);

        DLL.insertLast(50);




       // System.out.println("Before reverse : ");
       // printData();

       // System.out.println("After reverse : ");
       // DLL.reverseList();
       // printData();
        
    }

}
