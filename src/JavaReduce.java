
import java.util.*;
public class JavaReduce {
    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(2,6,7,9,5,8,20);
        Integer value = List.stream().reduce((a, b) ->a+b).get();
        System.out.println(value/List.size());
        Double avg = Double.valueOf(List.stream().reduce((a, b ) ->value/List.size()).get());
        System.out.println(avg);
    }
}
