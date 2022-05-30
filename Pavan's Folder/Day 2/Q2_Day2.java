// Question Link https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

/* Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i]

 Return the answer in an array. */

 class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];//Create a new array because we need answer in array format
        for(int i =0;i<=nums.length;i++){
            int count=0;
            for(int j=0;j<=nums.length;j++){
            
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;//Number of element which are smaller then num[i]
        }
        return ans;
    }
}