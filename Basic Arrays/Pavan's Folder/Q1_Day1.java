// question link:https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*(nums.length)];
        int i=0;
        while(i<nums.length){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
            i++;
        }
        return ans;
    }
}

