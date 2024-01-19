//package 1darray;
import java.util.Scanner;
public class dec {

  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n= scn.nextInt();
    int [] arr=new int[n];
    
    for(int i=0;i<=n-1;i++){
      arr[i]=scn.nextInt();
    }
      System.out.println(arr);
    for(int i=0;i<=n-1;i++){
      System.out.println("val at index"+ i +" "+ arr[i]);
    }
     
  }  
}
