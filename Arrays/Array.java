import java.util.Scanner;

// !-------------Add all the array elements--------------- 1

/*
 * public class demo{
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("ENTER THE NO. OF ARRAY ELEMENTS: ");
 * int n = sc.nextInt();
 * 
 * int []array = new int[n];
 * 
 * System.out.println("ENTER THE ELEMENTS OF ARRAYS: ");
 * for(int i=0; i<n; i++){
 * System.out.println("Elements "+ (i+1) + ": ");
 * array [i] = sc.nextInt();
 * }
 * 
 * int sum=0;
 * 
 * for(int i=0; i<n; i++){
 * sum += array[i];
 * }
 * 
 * System.out.println("-------------------------");
 * System.out.println("Addition of all the arrays is : "+sum);
 * 
 * 
 * }
 * }
 */

// !------------Add two arrays & store its value in result------------ 2

/*
 * public class demo{
 * public static void main(String[] args) {
 * int [] arr1 ={4,9,9,8,4,2,4};
 * int [] arr2 ={1,8,9,2,4,7,3};
 * 
 * int [] result = new int[arr1.length];
 * 
 * for(int i=0; i<arr1.length; i++ ){
 * result [i] = arr1[i] + arr2[i];
 * }
 * 
 * for(int i=0; i<result.length; i++){
 * System.out.print(result[i] + ",");
 * }
 * }
 * }
 */

/*
 * public class Array {
 * 
 * public static void main(String[] args) {
 * int []arr1={5,8,4,1,2,6,9,8,};
 * int n1 = arr1.length;
 * 
 * int []arr2={8,4,1,5,2,4,6,72,5};
 * int n2 = arr2.length;
 * 
 * int [] result = new int[n1 + n2];
 * 
 * int k =0;
 * 
 * for(int i=0; i<n1; i++){
 * result [k++] = arr1[i];
 * }
 * 
 * for(int i=0; i<n2; i++){
 * result[k++] = arr2[i];
 * }
 * 
 * for(int i=0; i<result.length; i++){
 * System.out.print(result[i] + " ");
 * } }
 * }
 */

// !----------check if all elements of array are 0 or not-----------3

/*
 * public class demo {
 * 
 * 
 * public static void main(String[] args) {
 * int []arr = {4,5,8,8};
 * 
 * boolean flag = false;
 * 
 * for(int i=0; i<arr.length; i++){
 * if(arr[i] ==0){
 * flag=true;
 * }
 * }
 * 
 * if(flag == true){
 * System.out.println("contain zero");
 * }else{
 * System.out.println("Not contain zero");
 * }}
 * }
 */

/*
 * public class demo {
 * 
 * public static void main(String[] args) {
 * int []arr={2,3,7,12,89};
 * 
 * boolean isPrime = true;
 * 
 * for(int i=0; i<arr.length; i++){
 * if(arr[i]%2==0){
 * isPrime=false;
 * }
 * }
 * if(isPrime == false){
 * System.out.println(" not Prime ");
 * }else{
 * System.out.println(" prime");
 * }
 * }
 * }
 */

// !----------------------sort method----------------4

/*
 * public class demo {
 * 
 * public static void main(String[] args) {
 * int []arr={8,4,2,5,6,9,5,1,4};
 * 
 * Arrays.sort(arr);
 * 
 * for(int i : arr){
 * System.out.print(i);
 * }
 * }
 * }
 */

// !--------------find elements in array----------------5
/*
 * public class demo {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * int arr[]={4,5,8,9,3,2,2,1};
 * System.out.println("Enter element to find: ");
 * int find = sc.nextInt();
 * 
 * for(int i=0; i<arr.length; i++){
 * if(arr[i] == find){
 * System.out.println("found");
 * }}
 * System.out.println("Not found in array");
 * }
 * }
 */

// !------------find the duplicate elements-----------------6

/*
 * public class demo {
 * 
 * public static void main(String[] args) {
 * int arr[]={4,5,6,8,9,9,5,5,7,1,2,4,0};
 * finddublicate(arr);
 * }
 * 
 * public static void finddublicate(int[] arr){
 * System.out.println("Dublicate elements found in arrays ");
 * boolean hasdublicate = false;
 * 
 * for(int i=0; i<arr.length; i++){
 * for(int j=i+1; j<arr.length; j++){
 * if(arr[i] == arr[j]){
 * System.out.println("Element : " + arr[i]);
 * hasdublicate = true;
 * break;
 * }
 * }}
 * if(!hasdublicate){
 * System.out.println("Dublicate elements are not found ");
 * }}}
 */

// !-----------------find comman element in array-------------7
/*
 * import java.util.HashSet;
 * import java.util.Set;
 * 
 * public class demo {
 * 
 * public static void main(String[] args) {
 * int array1[]={4,5,6,8,9,9};
 * int array2[]={8,9,2,5,9,0};
 * Set<Integer> commonElement = findCommonElements(array1,array2);
 * System.out.println("Common elements: "+ commonElement);
 * 
 * }
 * 
 * public static Set<Integer> findCommonElements(int array1[],int []array2){
 * 
 * Set<Integer> set1 = new HashSet<>();
 * Set<Integer> commoSet = new HashSet<>();
 * 
 * for (int num : array1) {
 * set1.add(num);
 * }
 * 
 * for (int num : array2){
 * if(set1.contains(num)){
 * commoSet.add(num);
 * }}
 * return commoSet;
 * }}
 */

// !---------------sum of coloum in 2d array ------------------8
/*
 * 
 * public class Array {
 * 
 * public static void main(String[] args) {
 * int row = 3;
 * int col = 3;
 * int[][] matrix = new int[row][col];
 * 
 * Scanner sc = new Scanner(System.in);
 * // ?------take 2d array elements
 * System.out.println("Enter " + row * col + " Values: ");
 * for (int i = 0; i < row; i++) {
 * for (int j = 0; j < col; j++) {
 * matrix[i][j] = sc.nextInt();
 * }
 * }
 * //? take a number of coloumn to add
 * System.out.println("Enter the colum number: ");
 * int rows = sc.nextInt();
 * 
 * //? make a sum of rows
 * int sum = 0;
 * for (int j = 0; j < col; j++) {
 * sum += matrix[j][rows];
 * }
 * 
 * System.out.println("The sum of rows " + rows + ": " + sum);
 * 
 * for (int j = 0; j < col; j++) {
 * System.out.println(matrix[j][rows - j - 1]);
 * }}
 * }
 */

// !-----------------------reverse array-----------------------9

/*
 * public class Array {
 * 
 * //? defind methods
 * public static void reverse(int arr[]){
 * int first = 0;
 * int last = arr.length-1;
 * 
 * while (first<last) {
 * int temp = arr[last];
 * arr[last] = arr[first];
 * arr[first] = temp;
 * 
 * first++;
 * last--;
 * }
 * }
 * public static void main(String[] args) {
 * int arr[]= {4,5,8,9,2,3,1,5,22,8,19,5};
 * 
 * reverse(arr);
 * for(int i=0; i<arr.length; i++){
 * System.out.print(arr[i] +" ");
 * }}
 * }
 * 
 * //!------------------search the element---------------------10
 * 
 * /*
 * public class Array {
 * 
 * public static void search(int arr[],int num){
 * int index = -1;
 * for(int i=0; i<arr.length; i++){
 * if(num == arr[i]){
 * index =arr[i];
 * break;
 * }
 * }
 * if(index != -1){
 * System.out.println("Value found ");
 * }else{
 * System.out.println("Value not found");
 * }}
 * 
 * public static void main(String[] args) {
 * int arr[]= {4,2,6,9,8};
 * int num=8;
 * search(arr, num);
 * }
 * }
 */

// !-------------------parirs of element of array----------------11
/*
 * public class Array {
 * 
 * // ?make method
 * public static void pairElements(int arr[]) {
 * int total = 0;
 * for (int i = 0; i < arr.length; i++) {
 * int current = arr[i];
 * for (int j = i + 1; j < arr.length; j++) {
 * System.out.print("(" + current + "," + arr[j] + ")");
 * 
 * total++;
 * }
 * System.out.println();
 * }
 * System.out.println("Total pairs: " + total);
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 2, 4, 5, 6, 8, 7, 3 };
 * pairElements(arr);
 * }
 * }
 */
