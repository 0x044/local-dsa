void main() {
    String test = "{()}";

    Stack<Character> myStack = new Stack<>();
    HashMap<Character, Character> closeToOpen = new HashMap<>();
    closeToOpen.put(')', '(');
    closeToOpen.put(']', '[');
    closeToOpen.put('}', '{');
    for(char c : test.toCharArray()){
        if(closeToOpen.containsKey(c)){
            if(!myStack.isEmpty() && myStack.peek() == closeToOpen.get(c)){
                myStack.pop();
            }else{
                IO.println("False");
            }
        }else{
            myStack.add(c);
        }
    }

    IO.println(myStack.isEmpty());
}