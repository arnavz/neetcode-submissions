class Solution {
    public int maxArea(int[] heights) {
       // Your code goes here
        int i = 0;
        int j = heights.length - 1;
        int maxArea = 0;
        while(i<j){
            int area = (j-i)*Math.min(heights[i], heights[j]);
            
            if(area > maxArea)
                maxArea = area;
            if(heights[i]>heights[j]){
                j--;
            }
            else if(heights[i]<=heights[j]){
            i++;
            }
            
        }
        return maxArea; 
    }
}
