class Solution { 
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxV = max(candies);
        
        List <Boolean> lb = new ArrayList<>();
        int n = candies.length;
        for(int i = 0;i < n;i++)
        {
            if( (candies[i] + extraCandies) >= maxV)
            {
                lb.add(true);
            }
            else
            {
                lb.add(false);
            }
        }
        return lb;
    }


    int max(int[] num)
    {
        int n = num.length;
        int max = num[0];
        
        for(int i = 0;i < n;i++)
        {
            if(num[i] > max)
            {
                max = num[i];
            }
        }
        return max;
    }
}