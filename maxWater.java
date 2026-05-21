public class maxWater {
    static void main(String[] args) {
        int[] arr = {1, 7, 2, 5, 4, 7, 3, 6};
        int maxVolume = 0;
        int left = 0, right = arr.length-1;

        while(left < right){
            int currVolume = Math.min(arr[left], arr[right])*(right - left);
            maxVolume = Math.max(currVolume, maxVolume);

            if(arr[left] < arr[right]){
                left++;
            } else if (arr[left] >= arr[right]) {
                right--;
            }
        }

        IO.print(maxVolume);
    }
}
