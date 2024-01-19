public class lefttoright {
    public static void main(String[] args) {
        int [][]arr = new int[5][5];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=count;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                //left to right
                for(int j=0;j<arr[0].length;j++){
                    System.out.println(arr[i][j]+"");
                }
            }
            else{
                //right to left
                for(int j=arr[0].length-1;j>=0;i--){
                    System.out.println(arr[i][j]+"");
                }
            }
        }
    }
    
}
