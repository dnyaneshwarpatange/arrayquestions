public class NoOfOccurences {
    public static void main(String[] args) {
        int[] arr = {8,7,5,1,1,2,5,4,58,9,3};
        int n = arr.length;
        int x = 1;
        System.out.println(findOccurences(arr, n, x));
        
    }
    static int findOccurences(int[] arr,int n,int x){
        int Counts = 0;
        for (int i = 0; i < n; i++) 
            if(x==arr[i])
            Counts++;
            return Counts;

            

    };
  
    
}
