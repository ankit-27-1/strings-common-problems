public class file3 {
    public static void main(String[] args) {
        System.out.println(duplicates("helloodudees"));
    }
    static String duplicates(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++) {
            boolean res=true;
            for(int j=i-1;j>=0;j--){
                if(str.charAt(i)==str.charAt(j)){
                    res=false;
                }
            }
            if(res==true){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
