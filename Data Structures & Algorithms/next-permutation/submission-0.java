class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length -1;
        int pivotIndex = -1;
        for(int i = len; i>0;i--){
            if(nums[i-1]<nums[i]){
                pivotIndex = i-1;
                break;
            }
        }
        if(pivotIndex == -1){
            reverse(nums, 0, len);
            return;
        }
        int j = len;
        while(nums[j]<=nums[pivotIndex]){
            j--;
        }
           
        swap(nums, pivotIndex, j);
        reverse(nums, pivotIndex+1, len);
        return;
    }

    public static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
        return;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
}