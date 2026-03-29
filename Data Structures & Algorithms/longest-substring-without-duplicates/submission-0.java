class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        TreeSet<Character> ts = new TreeSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            while(ts.contains(c)){
                ts.remove(s.charAt(l));
                l++;
            }
            ts.add(c);
            max = Math.max(max,i-l+1);
        }
        return max;
    }
}
