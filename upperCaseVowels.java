public class Main {
    static int upperVowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='O' || str.charAt(i)=='A' || str.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="bAeUamn";
        System.out.println(upperVowel(str));
    }
}
