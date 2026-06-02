class Solution {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        boolean[] zeroIndex = new boolean[nums.length];
        int product = 1;
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==0){
                countZero++;
                zeroIndex[i] = true;
                continue;
            }
            product = product * nums[i];
        }
        System.out.println(product);
        for(boolean val : zeroIndex){
            System.out.println(val);
        }
        System.out.println(countZero);
        if(countZero == nums.length){
            product = 0;
        }
        System.out.println(product);
        
        
        for(int i=0; i<nums.length ; i++){
            if(countZero>0){
                if(zeroIndex[i]&&countZero==1){
                nums[i]=product;
            }else{
                nums[i]=0;
            }
            
            }else{
                nums[i] = product/nums[i];
            }
        }
return nums;
    }
}  
