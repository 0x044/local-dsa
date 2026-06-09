void main() {
    int[] temperatures = {30,38,30,36,35,40,28};

    int[] res = new int[temperatures.length];

    Stack<int[]> stack = new Stack<>();

    for(int i = 0; i < temperatures.length; i++){
        int t = temperatures[i];

        while(!stack.isEmpty() && stack.peek()[0] < t){
            int[] pair = stack.pop();
            res[pair[1]] = i - pair[1];
        }
        stack.push(new int[]{t, i});
    }

    IO.print(Arrays.toString(res));
}