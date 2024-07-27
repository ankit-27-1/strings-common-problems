class Solution {
    public String getSmallestString(String s) {
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        boolean ans=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i]>arr[i+1] && ans==false){
                char temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                ans=true;
            }
            else if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i]>arr[i+1] && ans==false){
                char temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                ans=true;
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
