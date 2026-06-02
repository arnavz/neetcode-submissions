class Solution {
    public boolean isValid(String s) {
       Stack<Character> brackets = new Stack<>();
       for(int i = 0; i < s.length(); i++){
       char ch = s.charAt(i);
       if(ch == '(' || ch =='{' || ch =='['){
        brackets.push(ch);
       } else{
        if(brackets.empty())
            return false;
        char top = brackets.peek();
        if(
            (ch == ']' && top == '[')||
            (ch == '}' && top == '{')||
            (ch == ')' && top == '(')
            ){
                brackets.pop();
            }else return false;
       }
    }
    return brackets.empty();
    }
}