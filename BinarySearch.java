public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 8;
        System.out.println(Bsearch(arr, target));
    }
    static int Bsearch(int[] arr,int target){
        boolean istrue = arr[0]<arr[arr.length-1];
        int start = 0;
        int end =arr.length-1;


        while(start<end){
            int mid = start+(end-start)/2;
            if(istrue){
                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid+1;
    
                }else {
                    return mid;
                }

            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else if(target<arr[mid]){
                    start = mid+1;
    
                }else {
                    return mid;
                }
            }

            
        }return -1;
    }
    
}
