class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String d=s+s;
        String ans=d.substring(1,d.length()-1);
        return ans.contains(s);
    }
}
