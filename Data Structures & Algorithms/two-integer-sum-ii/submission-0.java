class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length - 1;
        int i = 0;
        int[] res = new int[2];
        while(i<j){
            if(i<j && (numbers[i] + numbers[j] == target)){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
            if(numbers[i] + numbers[j] < target){
                i++;
            } else if(numbers[i] + numbers[j] > target){
                j--;
            }

        }
        return res;
        
    }
}
