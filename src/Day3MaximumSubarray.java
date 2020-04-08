class Day3MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0], maxCurr=nums[0];
        for (int i=1;i<nums.length;++i){
            maxCurr= Math.max(maxCurr+nums[i], nums[i]);
            maxSoFar=Math.max(maxSoFar, maxCurr);	
        }
        return maxSoFar;
    }
}