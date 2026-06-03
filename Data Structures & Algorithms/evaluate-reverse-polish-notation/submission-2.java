class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            if(isOperator(tokens[i])){
                String a = stack.pop();
                String b = stack.pop();
                stack.push(operate(a,b,tokens[i]));
            }else{
                stack.push(tokens[i]);
            }
            
        }
        return Integer.parseInt(stack.pop());
    }
    public String operate(String a, String b, String operator){
         if(operator.equals("*"))
          return String.valueOf(Integer.parseInt(b)*Integer.parseInt(a));
          if(operator.equals("+"))
           return String.valueOf(Integer.parseInt(b)+Integer.parseInt(a));
           if(operator.equals("/"))
            return String.valueOf(Integer.parseInt(b)/Integer.parseInt(a));
            if(operator.equals("-"))
             return String.valueOf(Integer.parseInt(b)-Integer.parseInt(a));
             return null;
    }
    public boolean isOperator(String str){
        if(str.equals("+") || str.equals("*") ||str.equals("/")||str.equals("-"))
        return true;
        return false;
    }
}
