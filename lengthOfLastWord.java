class Solution {
    public int lengthOfLastWord(String s) {
        int result=0;
        int n=s.length();
        if(n==1){
            return 1;
        }
        if(n==2){
            if(s.charAt(0)==' ' && s.charAt(1)==' '){
                return 0;
            }
            else if(s.charAt(0)==' ' || s.charAt(1)==' '){
                return 1;
            }
        }
        int count=0;
        if(s.charAt(n-1)==' '){
            int i=1;
            while(s.charAt(n-i-1)==' '){
                count++;
                i++;
            }
            int j=1;
            while(n-i-j>=0 && s.charAt(n-i-j)!=' '){
                result++;
                j++;
            }
        }
        else if(s.charAt(n-1)!=' '){
            int k=0;
            while(n-k-1>=0 && s.charAt(n-k-1)!=' '){
                result++;
                k++;
            }
        }
        return result;
    }
}
