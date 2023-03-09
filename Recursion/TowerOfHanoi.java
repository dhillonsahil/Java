package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        char source = 'A';
        char helper = 'B';
        char destination = 'C';
        int n =2;
        tuh(n, source, destination, helper);
    }
    public static void tuh(int n,char source, char destination ,char helper){
    //     if(n>=1){
    //     tuh(n-1, source, helper,destination);
    //     System.out.println("Move disk "+ n + " from "+ source +" to " + destination);
    //     tuh(n-1, helper, destination, source);
    // }
    if(n==1){
            System.out.println("Move disk "+ n + " from "+ source +" to " + destination);
        return;
    }
    tuh(n-1, source, helper,destination);
        System.out.println("Move disk "+ n + " from "+ source +" to " + destination);
        tuh(n-1, helper, destination, source);
    }
    
}
