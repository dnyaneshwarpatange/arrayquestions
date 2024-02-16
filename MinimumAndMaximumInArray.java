import java.util.Arrays;

public class MinimumAndMAximumInArray {
    public static void main(String[] args) {
        
    int[] arr = {4,8,4,8,4,8,9,11,0,44,5,1};
    findminmax(arr);
    }
    


    
}
static void findminmax(int[] arr){
    Arrays.sort(arr);
    System.out.println("Minimum is:" + arr[0] + "MAximum is:"+ arr[arr.length-1] );
}
