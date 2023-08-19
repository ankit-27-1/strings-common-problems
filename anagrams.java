public class Main {
    static boolean anagrams(String str1,String str2){
        char[] ch1=new char[str1.length()];
        char[] ch2=new char[str2.length()];
        for(int i=0;i<str1.length();i++){
            ch1[i]= str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++){
            ch2[i]=str2.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean result=Arrays.equals(ch1,ch2);
        return result;
    }
    public static void main(String[] args) {
        String str1="none";
        String str2="onen";
        System.out.println(anagrams(str1,str2));
    }
}
