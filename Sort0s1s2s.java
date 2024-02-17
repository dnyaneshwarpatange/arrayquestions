        import java.util.Arrays;

        public class Sort0s1s2s {
            public static void main(String[] args) {
                int[] arr = {0,2,1,2,0,1,2,0,0,2,1,0,2,1};
                sortarr(arr);
            }
            static void sortarr(int[] arr){
                int[] newarr = new int[arr.length];
                Arrays.sort(arr);
                for (int i = 0; i < arr.length; i++) {
                    newarr[i] = arr[i];
                    System.out.print(newarr[i]+" ");
                   

                }

            
            }
            
        }
