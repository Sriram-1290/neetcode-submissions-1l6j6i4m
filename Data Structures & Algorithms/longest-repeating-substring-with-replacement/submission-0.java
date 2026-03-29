class Solution {
    public int characterReplacement(String s, int k) {
        int maxf=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0) + 1);
            int max=0;
            for(int j:hm.values()){
                max = Math.max(j,max);
            }
            while(i-l+1 - max > k){
                hm.put(s.charAt(l) , hm.get(s.charAt(l))-1);
                l++;
                for(int j:hm.values()){
                max = Math.max(j,max);
                }   
            }
            maxf = Math.max(maxf, i-l+1);
        }
        return maxf;
    }
}
