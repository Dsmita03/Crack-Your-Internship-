package Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
            int temp=nums[correct];
            nums[correct]=nums[i];
            nums[i]=temp;
            }
            else{
                i++;
            }
        }
        return nums[nums.length-1];
        
    }
}