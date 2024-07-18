package Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;  // This will track the position to place the non-zero elements
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        // Fill the rest of the array with zeros
        for (int i = k; i < n; i++) {
            nums[i] = 0;
        }
    }
}
