class Solution {
    public int maxDepth(String s) {
        int count1=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count1++;
            }
            if(s.charAt(i)==')'){
                count1--;
            }
            if(count1>max){
                max=count1;
            }
        }
        return max;
    }
}
