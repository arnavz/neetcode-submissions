class Solution {
    public void sortColors(int[] nums) {
        int sorted0 = 0;
        int sorted2 = nums.length-1;
        int i = 0;
        while(i<=sorted2){
          if(nums[i]==0){
                 swap(i++, sorted0++, nums);
            }
            else if(nums[i]==2){
                swap(i, sorted2--, nums);
            }
            else
            i++;
        }   
    }
    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}