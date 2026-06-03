class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            if(isOperator(tokens[i])){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(operate(a,b,tokens[i]));
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            
        }
        return stack.pop();
    }
    public int operate(int a, int b, String operator){
         if (operator.equals("*")) {
            return b * a;
        }

        if (operator.equals("+")) {
            return b + a;
        }

        if (operator.equals("/")) {
            return b / a;
        }

        return b - a;
    }
    public boolean isOperator(String str){
        if(str.equals("+") || str.equals("*") ||str.equals("/")||str.equals("-"))
        return true;
        return false;
    }
}
