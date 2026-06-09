void main() {
    int target = 10;
    int[] position = {1, 4};
    int[] speed = {3, 2};

    int[][] pair= new int[position.length][2];

    for(int i = 0; i < position.length; i++){
        pair[i][0] = position[i];
        pair[i][1] = speed[i];
    }

    Arrays.sort(pair, (a, b)-> Integer.compare(a[0], b[0]));

    Stack<Double> stack = new Stack<>();

    for(int[] p : pair){
        stack.push((double)(target - p[0]/p[1]));
        if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size()-2)){
            stack.pop();
        }
    }

    IO.print(stack.size());
}