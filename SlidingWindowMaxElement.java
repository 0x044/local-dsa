void main() {
    int[] nums = {1, 2, 1, 0, 4, 2, 6};
    int k = 3;
    int[] res = new int[nums.length - k + 1];
    Deque<Integer> dq = new ArrayDeque<>(); // stores indices

    for (int right = 0; right < nums.length; right++) {
        // Remove elements outside the window
        while (!dq.isEmpty() && dq.peekFirst() < right - k + 1)
            dq.pollFirst();

        // Maintain decreasing order — remove smaller elements from back
        while (!dq.isEmpty() && nums[dq.peekLast()] < nums[right])
            dq.pollLast();

        dq.offerLast(right);

        if (right >= k - 1)
            res[right - k + 1] = nums[dq.peekFirst()];
    }
    IO.println(res);
}