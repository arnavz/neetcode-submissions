class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> high = new Stack<>();
        int highpos = 0;
        int len = temperatures.length; 
        int[] result = new int[len];     

        for(int i = len-1; i >= 0; i-- ){
            if(high.empty()){
               result[i] = 0; 
               high.push(i);
               continue;
            }
            while(!high.empty() && temperatures[high.peek()]<=temperatures[i]){
                high.pop();
            }
            if(high.empty()){
                result[i]=0;
            }else{
                result[i]=high.peek()-i;
            
            } 
            high.push(i);
            
                   }
                   return result;
    }
}
