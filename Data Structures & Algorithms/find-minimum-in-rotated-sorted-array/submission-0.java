class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int a=nums[0];
        for(int i=1; i<nums.length; i++){
            if(a>nums[i]){
                a=nums[i];
                break;
            }
        }
        return a;
    }
}
