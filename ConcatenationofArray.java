public class ConcatenationofArray{
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,8};
    }
    public int[] getConcatenation(int[] nums){
        int length = nums.length;
        int[] ans = new int[2*length];
        for (int i = 0; i <length; i++) {
            ans[i]=nums[i];
            ans[i+length]=nums[i];
        }
        return ans;
    }



}