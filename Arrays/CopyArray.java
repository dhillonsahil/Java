package Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int roll_no[] = { 3,10,18,27,30};
        // int bestfriends[] = roll_no.clone();
        int friends[] = new int[roll_no.length];
        int a=0;
        for(int n:roll_no){
            friends[a]=n;
            a++;
        }
        for(int i:friends){
            
        System.out.println(i);
        }

    }
}
