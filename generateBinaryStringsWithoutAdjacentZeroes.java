class Solution {
    char one='1';
    char zero='0';
    boolean flag=false;
    List<String> ans=new ArrayList<>();
    StringBuilder sb=new StringBuilder("");
    public void sol(int n,int i){
        if(sb.length()==n){
            ans.add(sb.toString());
            return;
        }
        if(flag==true || i==0){
            sb.append(zero);
            flag=false;
            sol(n,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
        flag=true;
        sb.append(one);
        sol(n,i+1);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> validStrings(int n) {
        sol(n,0);
        return ans;
    }
}
