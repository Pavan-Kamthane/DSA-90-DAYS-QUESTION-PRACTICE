// Question Link: - https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }

            if(sum > max){
                max=sum;
            }
            sum=0;
        }
        return max;
    }
}