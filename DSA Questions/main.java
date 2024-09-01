//!DSA Using Java
import java.util.Arrays;


// !Question-1. Implement Bubble sort such that it will work in O(n) time for best case.

/*
 * public class main {
 * 
 * public static void bobbleSort(int arr[]){
 * int n = arr.length;
 * boolean swap;
 * 
 * for(int i=0; i<n-1; i++){
 * swap = false;
 * 
 * for(int j=0; j<n-i-1; j++){
 * if(arr[j] > arr[j+1]){
 * int temp = arr[j];
 * arr[j] = arr[j+1];
 * arr[j+1] = temp;
 * 
 * swap = true;
 * 
 * }
 * }
 * if(!swap){
 * break;
 * }
 * }
 * }
 * 
 * public static void printArray(int arr[]){
 * for(int i=0; i<arr.length; i++){
 * System.out.print(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = {11,2,13,4,25};
 * 
 * bobbleSort(arr);
 * 
 * System.out.println("Sorted array: ");
 * printArray(arr);
 * 
 * }
 * }
 */



// !Question 2. Differentiate between linear search and binary search.

// ? Definition : Linear search searches elements ffrom the beginning to the
// ending of the list .
// ? Definition : Binary search searches elements by repeatedly dividing the
// sorted list into a halves.

// ? Time complexity for linear search :
// best case: O(1)
// avg case: O(n)
// worst case: O(n)

// ? Time complexity for binary search :
// best case: O(1)
// avg case: O(log n)
// worst case: O(log n)



// !Question 3. Implement insertion sort and write down its time and space
// complexity analysis.

/*
 * public class main {
 * 
 * public static void selectionSort(int arr[]){
 * int n = arr.length;
 * 
 * for(int i=0; i<n-1; i++){
 * int minPos = i;
 * for(int j=i+1; j<n; j++){
 * if(arr[minPos] > arr[j]){
 * minPos = j;
 * }
 * }
 * //swap
 * int temp = arr[minPos];
 * arr[minPos] = arr[i];
 * arr[i] = temp;
 * }
 * }
 * 
 * public static void printArray(int arr[]){
 * for(int i=0; i<arr.length; i++){
 * System.out.print(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = {4,9,3,2,1};
 * 
 * selectionSort(arr);
 * 
 * printArray(arr);
 * }
 * }
 */



// !Question 4. Differentiate between array and linked list.

// ? Definition : Array is a collection of elements store in contigious memory
// and each element is indexed to acces directly .
// ? Fixed size : the size of the array is determined at the time of its
// creation and cannot be changed dynamically.
// ? Types :
// 1D array
// 2D array

// ? Definition : A collection of elements called nodes, where each node
// contains the data and a reference to the next node .
// ? Dynamic size : nodes can be added or removed easily .
// ? Types :
// singly linked list
// Doubly linked list
// Circular linked list
// Singly doubly linked list



// !Question 5. Write down the code to check if given string is Palindrome.

/*
 * public class main {
 * 
 * public static boolean checkPalindrome(String str){
 * 
 * int left = 0;
 * int right = str.length() - 1;
 * while (left < right) {
 * if(str.charAt(right) != str.charAt(left)){
 * return false;
 * }
 * left ++;
 * right--;
 * }
 * return true;
 * }
 * 
 * public static void main(String[] args) {
 * String str = "namans";
 * 
 * System.out.println(checkPalindrome(str));
 * }
 * }
 */



// !Question 6. Write down the code to delete middle element of given array.

/*
 * public class main {
 * 
 * public static int deleteElement(int arr[]){
 * int n = arr.length;
 * 
 * int middle = n/2;
 * for(int i=middle; i<n-1; i++){
 * arr[i] = arr[i+1];
 * }
 * return Arrays.copyOf(n, n - 1);
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = {1,2,3,4,5,6};
 * 
 * int result = deleteElement(arr);
 * 
 * System.out.println(result);
 * }
 * }
 */



// !Question 7. Implement the push and pop operation of stack using singly linked list.
/*
 * class Node {
 * int data;
 * Node next;
 * 
 * // Constructor to create a new node
 * Node(int data) {
 * this.data = data;
 * this.next = null;
 * }
 * }
 * 
 * class Stack {
 * private Node top;
 * 
 * // Constructor
 * Stack() {
 * this.top = null;
 * }
 * 
 * // Method to check if the stack is empty
 * public boolean isEmpty() {
 * return top == null;
 * }
 * 
 * // Method to push an element
 * public void push(int data) {
 * Node newNode = new Node(data);
 * newNode.next = top;
 * top = newNode;
 * 
 * }
 * 
 * // Method to pop an element from the stack
 * public int pop() {
 * if (isEmpty()) {
 * System.out.println("Stack is empty. Cannot pop.");
 * return -1;
 * } else {
 * int poppedData = top.data;
 * top = top.next;
 * return poppedData;
 * }
 * }
 * 
 * // Method to peek the top element of the stack
 * public int peek() {
 * if (isEmpty()) {
 * System.out.println("Stack is empty.");
 * return -1;
 * } else {
 * return top.data;
 * }
 * }
 * }
 * 
 * public class main {
 * public static void main(String[] args) {
 * Stack stack = new Stack();
 * 
 * stack.push(10);
 * stack.push(20);
 * stack.push(30);
 * 
 * System.out.println("Top element is " + stack.peek());
 * System.out.println("Popped element is " + stack.pop());
 * System.out.println("Top element after pop is " + stack.peek());
 * }
 * }
 */



// !Question 8. Explain the time and space complexity of all the iterative sorting algorithms.

// ?Bubble sort :

// ?Bubble Sort repeatedly steps through the list, compares adjacent elements,
// and swaps them if they are in
// ?the wrong order. This process is repeated until the list is sorted.

// Best Case: O(n) when the array is already sorted.
// Average Case: O(n²) due to the nested loops.
// Worst Case: O(n²) when the array is sorted in reverse order.

// ?Selection sort :

// ?Selection Sort repeatedly selects the smallest (or largest, depending on the
// order) element from the unsorted
// ? portion and swaps it with the first element in the unsorted portion.

// Best Case: O(n²) because the algorithm always scans the entire unsorted
// portion.
// Average Case: O(n²).
// Worst Case: O(n²).



//!Question 9. Write a code to  remove nth node from end of the list.

public class main {

   static class node{
        //attributes
        int data;
        node next;

       //constructor
       node(int data){
        this.data = data;
        this.next = null;
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
       head = newNode;
    }

    static void removeNthElement(int n){
 
        //calculate size
        int size = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
             size++;
        }

        if(size == n){
           head = head.next;
           return;
        }

        int index = 1;
        int indexFind = size-n;
        node prev = head;
        while (index < indexFind){
            prev = prev.next;
            index++;
        }
        prev.next = prev.next.next;
        return;
    }


    static void printList(){

       if(head == null){
        System.out.println("List is empty");
       }
       while(head != null){
        System.out.print(head.data + " -> " );
        head = head.next;
       }System.out.println("null");
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        main ll = new main();

        ll.insertFirst(2);
        ll.insertFirst(4);
        ll.insertFirst(6);
        ll.insertFirst(8);

       
        
        ll.removeNthElement(3);
        ll.printList();
        
    }
}