void main(){
    int[] nums = {1, 2, 3, 4};
    int target = 3;

    int left = 0, right = nums.length-1;
    while(left < right){
        int sum = nums[left]+nums[right];

        if(sum == target){
            IO.print(left+1 + "," + (right+1));
            break;
        } else if (sum > target) {
            right--;
        }else if(sum < target){
            left++;
        }
    }
}