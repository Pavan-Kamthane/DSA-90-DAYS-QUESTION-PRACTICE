https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){   
            int digit = 0;
            while(nums[i]>0){
                digit++;
                nums[i]/=10;
            }
            if(digit %2 ==0){
                ans++;
            }
        
        }
        return ans;
    }
}

//Optimise solution

class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){   
            //int digit = 0;
            // while(nums[i]>0){
            //     digit++;
            //     nums[i]/=10;
            // }
            int digit = (int) Math.log10(nums[i])+1;
            if(digit %2 ==0){
                ans++;
            }
        
        }
        return ans;
    }
}