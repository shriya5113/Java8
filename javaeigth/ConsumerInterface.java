package javaeigth;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    //only consume no o/p will be given
    public static void main(String[] args) {
        Consumer<String> consumer1 = x -> System.out.println(x.toLowerCase());
        consumer1.accept("shriya");
        //we have another function and then

        Consumer<List<String>> consumer = li ->
        {
            for (String str : li)
            {
                System.out.println(str.toUpperCase());
            }
        };

        consumer.accept(Arrays.asList("shriya","shubham","arpit"));
    }
}
