package Api;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.*;

public class Learn_Stream{
    public static void main(String[] agrs){
        List<Integer> list = Arrays.asList(1,2,3,4,5);


        // for each uses this interfaces
        
        // Consumer<Integer> cr = new Consumer<Integer>(){
        //     @Override
        //     public void accept(Integer i){
        //         System.out.println(i);
        //     }

        // };

        Stream<Integer> str = list.stream();
        Stream<Integer> str1 = str.map(n->n*n);
        
        str1.forEach(n->System.out.println(n));
    }
}