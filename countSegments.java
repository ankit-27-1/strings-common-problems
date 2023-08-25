class Solution {
    public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        boolean result=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                result=true;
            }
        }
        if(result==false){
            return 0;
        }
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        if(s.charAt(0)==' '){
            return count-1;
        }
        return count;
    }
}
