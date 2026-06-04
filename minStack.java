import java.util.LinkedList;
import java.util.Objects;

public class minStack {
    static void main() {
        minStackImpl mins = new minStackImpl();

        mins.push(1);
        mins.push(2);
        mins.push(-1);

        IO.println(mins.top());
        mins.pop();
        IO.println(mins.top());
        IO.println(mins.getMin());
    }
}

class minStackImpl{
    LinkedList<Integer> stack;
    LinkedList<Integer> minTracker;

    public minStackImpl(){
        stack = new LinkedList<>();
        minTracker = new LinkedList<>();
    }

    public void push(int val){
        if(!minTracker.isEmpty() && minTracker.peekFirst() > val){
            minTracker.push(val);
            stack.push(val);
        }else if(minTracker.isEmpty()){
            stack.push(val);
            minTracker.push(val);
        }else{
            stack.push(val);
        }
    }

    public void pop(){
        if(!stack.isEmpty() && Objects.equals(minTracker.getFirst(), stack.getFirst())) {
            stack.pop();
            minTracker.pop();
        }else if(!stack.isEmpty()){
            stack.pop();
        }
    }

    public int top(){
        if(!stack.isEmpty()){
            return stack.getFirst();
        }
        return 0;
    }

    public int getMin(){
        if(!minTracker.isEmpty()){
            return minTracker.getFirst();
        }
        return 0;
    }
}