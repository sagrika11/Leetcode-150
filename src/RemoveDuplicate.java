import java.util.Arrays;

public class RemoveDuplicate {
    public static void main (String []args){
        int[]nums = {0,0,1,1,1,2,2,3,3,4};
        int n = nums.length;
         int[] ans = removeDuplicate(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] removeDuplicate(int[] nums, int n){
        
        int count =0;
        for (int i = 0; i<n; i++) {
            if(i<n-1 && nums[i]==nums[i+1]) continue;
            else {
                nums[count]=nums[i];
                count++;
            }
        }

        return nums;
    }
}
