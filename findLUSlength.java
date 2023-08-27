class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length()!=b.length()){
            return Math.max(a.length(),b.length());
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return Math.max(a.length(),b.length());
            }
        }
        return -1; 
    }
}
