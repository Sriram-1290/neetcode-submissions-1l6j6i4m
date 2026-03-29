class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        for(char c:a){
            if(count(a,c)!=count(b,c)){
                return false;
            }
        }
        return true;
    }
    public int count(char[] a,char b){
        int c=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                c++;
            }
        }
        return c;
    }
}
