class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> fi = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] ci = {intervals[0][0],intervals[0][1]};
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(start<=ci[1]){
                ci[1] = Math.max(ci[1], intervals[i][1]);
            }
            else{
                fi.add(ci);
                ci=new int[]{start,end};
            }
        }
        fi.add(ci);
        return fi.toArray(new int[fi.size()][]);
    }
}