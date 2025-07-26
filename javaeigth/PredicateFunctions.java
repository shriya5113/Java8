package javaeigth;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctions {
    public static void main(String[] args) {
        Predicate<String> predicate1 = x -> x.contains("e");
        Predicate<String> predicate2 = x -> (x.length()) == 5;
        Predicate<String> predicate3 = predicate1.and(predicate2);
        Predicate<String> predicate4 = x -> x.equalsIgnoreCase("hello");

        System.out.println(predicate3.test("hello"));
        System.out.println(predicate1.negate().test("Hello"));
        System.out.println(predicate1.equals("e"));
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers  = numbers.stream().filter(x -> x%2 ==0).collect(Collectors.toList());
        for (int i :numbers)
        {
            System.out.println( i);
        }


    }
}
