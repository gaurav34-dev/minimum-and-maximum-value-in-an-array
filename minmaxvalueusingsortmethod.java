import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
       System.out.println("Enter the size of the array");
       Scanner s = new Scanner(System.in);
       int size = s.nextInt();
       int [] array = new int[size];
       System.out.println("enter the elements in an array");
       for(int i=0;i<size;i++){
           array[i] = s.nextInt();
       }
      System.out.println("display the array");
        for(int i=0;i<size;i++){
           System.out.println(array[i]);
       }
       Arrays.sort(array);
       System.out.println("display the sorted array");
        for(int i=0;i<size;i++){
           System.out.println(array[i]);
       }
       System.out.println("maximum value is "+ array[size-1]);
       System.out.println("minimum value is "+ array[0]);
    }
}