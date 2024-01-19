//package 1darray;
import java.util.*;

public class travels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
            System.out.println("element of index"+ i +" "+arr[i]);
        }

    }
    
}
