class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> al1 = new ArrayList<>();
        Arrays.sort(nums);
        int x=0;
        while(x<nums.length-2){
            if (x > 0 && nums[x] == nums[x - 1]) {
                x++;
                continue;
            }

            int p1=x+1;
            int p2=nums.length-1;
            int goal = 0-nums[x];
            while(p1<p2){
                if((nums[p1]+nums[p2])<goal){
                    p1++;
                }
                else if((nums[p1]+nums[p2])>goal){
                    p2--;
                }
                else{
                    al1.add(nums[x]);
                    al1.add(nums[p1]);
                    al1.add(nums[p2]);
                    al.add(new ArrayList<>(al1));
                    al1.clear();
                    p1++;
                    p2--;
                    while (p1 < p2 && nums[p1] == nums[p1 - 1]) {
                        p1++;
                    }
                    while (p1 < p2 && nums[p2] == nums[p2 + 1]) {
                        p2--;
                    }
                }
            }
            x++;
        }
        return al;
    }
}