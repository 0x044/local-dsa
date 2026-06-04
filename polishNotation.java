void main(){
    String[] tokens = {"3","-4","+"};
    Stack<Integer> stack = new Stack<>();
    //Can reduce a lot of complexity and just check +-/* during runtime, pop twice push once
    for(String s : tokens){
        char c = s.charAt(0);
        if(s.matches("^[+-]?\\d+$")){
            stack.push(Integer.parseInt(s));
        }
        else if(s.matches("[+-/*]")){
            switch (c){
                case '+': {
                    int opA = stack.pop();
                    int opB = stack.pop();
                    stack.push(opB + opA);
                    break;
                }
                case '-' : {
                    int opA = stack.pop();
                    int opB = stack.pop();
                    stack.push(opB - opA);
                    break;
                }
                case '/' : {
                    int opA = stack.pop();
                    int opB = stack.pop();
                    stack.push(opB / opA);
                    break;
                }
                case '*' : {
                    int opA = stack.pop();
                    int opB = stack.pop();
                    stack.push(opB * opA);
                    break;
                }
            }
        }
    }

    IO.println(stack.pop());
}