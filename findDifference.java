class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch1=new char[s.length()];
        char[] ch2=new char[t.length()];
        for(int i=0;i<s.length();i++){
            ch1[i]= s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            ch2[i]=t.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i=0;
        while(i<s.length()){
            if(ch1[i]!=ch2[i]){
                return ch2[i];
            }
            i++;
        }
        return ch2[t.length()-1];
    }
}
