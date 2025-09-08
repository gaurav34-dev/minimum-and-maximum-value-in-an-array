import java.util.Scanner;
class Main {
     int max;
     int min;
    public static void main(String[] args) {
        int c;
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
      for(int i =0;i< size; i++){
          for(int j =i+1; j< size;j++){
              if(array[i]<array[j]){
                  continue;
              }
              else{
                  c = array[i];
                  array[i] = array[j];
                  array[j] = c;
              }
          }
      }
      System.out.println("display the sorted array");
        for(int i=0;i<size;i++){
           System.out.println(array[i]);
       }
      if(array[0]>array[size-1]){
          int max = array[0];
          int min = array[size-1];
          System.out.println("this element"+ max + "is the maximum");
           System.out.println("this element"+ min + "is the minimum");
      }
      else{
          int max = array[size-1];
          int min = array[0];
          System.out.println("this element"+ max + "is the maximum");
           System.out.println("this element"+ min + "is the minimum");
      }
    }
}