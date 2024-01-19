public class rverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
      //  int ans []={};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int t=arr[i];
           arr[i]=arr[j];
           arr[j]= t;
           i++;
           j--;

           System.out.println(arr[i]+" "+t);

        }
        
    }
    
}
