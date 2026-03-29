class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        for(char c: s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }
            else if(st.peek()!=hm.get(c)){
                st.push(c);
            }
            else{
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
