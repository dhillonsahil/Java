package Arrays;
public class MeriString {
    public static void main(String[] args) {
        String a = "pw";
        String p= "pw";
        System.out.println(a==p);
        a=a.concat("skills");
        System.out.println(a);
        System.out.println(p);
        System.out.println(a==p);
    }
}
