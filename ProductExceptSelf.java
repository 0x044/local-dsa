//fix this solution
import java.util.Arrays;

public class ProductExceptSelf {
    static void main(String[] args) {
        int[] nums = {2,3,4,7,9,0};
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        prefix[1] = nums[0];

        suffix[n - 1] = nums[n - 1];
        suffix[n - 2] = nums[n - 1];

        for(int i = 2; i < n; i++){
            prefix[i] = prefix[i - 1]*prefix[i-2];
        }

        for(int i = n-2; i >= 0; i--){
            suffix[i] = suffix[i+1]*suffix[i+2];
        }

        IO.println(Arrays.toString(prefix));
        IO.println(Arrays.toString(suffix));

    }
}
