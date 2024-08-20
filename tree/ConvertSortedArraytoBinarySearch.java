package tree;

public class ConvertSortedArraytoBinarySearch {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            return createTree(nums,start,end);
        }
        public TreeNode createTree(int[] nums,int start,int end) {
            if(start>end)
                return null;
            int mid = (start+end)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = createTree(nums,start,mid-1);
            node.right = createTree(nums,mid+1,end);
            return node;
        }
    }   
}
