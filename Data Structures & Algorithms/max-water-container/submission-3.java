class Solution {
    public int maxArea(int[] heights) {
        int ca=0;
        int max=0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            ca = Math.min(heights[l],heights[r]) * (r-l);
            max = Math.max(max,ca);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
