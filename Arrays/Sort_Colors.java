package Arrays;


class Solution {
        public void sortColors(int[] nums) {
            int [] count = new int[3];
            for(int i =0;i<nums.length;i++){
                count[nums[i]]++;
            }
                int j =0;
            for(int i =0;i<count.length;i++){
                while(count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;}
            }
        }
    }

