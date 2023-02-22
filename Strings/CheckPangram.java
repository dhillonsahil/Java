package Strings;
public class CheckPangram {
    public static void main(String[] args) {
        String str1= "The quick brown fox jumps over lazy dog";
        str1=str1.replace(" ","");
        str1=str1.toUpperCase();
        char ch[]=str1.toCharArray();
        int arr[]= new int[26];

        boolean tr=true;
        for(int i=0;i<ch.length;i++){
            arr[ch[i]-65]++;
        }
        for(int n:arr){
            if(n==0){
                System.out.println("not pangram");
                tr=false;
                break;
            }
        }
        if(tr){
            System.out.println("pangram");
        }
    }
}
