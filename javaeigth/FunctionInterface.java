package javaeigth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {

        Function<String,String> funtion1 = st -> st.toUpperCase();

        Function<List<String>,List<String>> funtion2 = li ->{
            List<String> list = new ArrayList<>();
            for(String str : li)
            {
                list.add(funtion1.apply(str));
            }
            return list;
        };


        Function<List<String>,List<String>> funtion3 = li ->{
            List<String> list = new ArrayList<>();
            for(String str : li)
            {
                list.add(str);
            }
            return list;
        };

        Function<String,String> funtion4 = Function.identity(); //return the same input

//        System.out.println(funtion2.apply(Arrays.asList("shriya","arpit","shubham")));
        System.out.println(funtion3.andThen(funtion2).apply(Arrays.asList("shriya","arpit","shubham"))); //we have opposite compose
        System.out.println(funtion4.apply("hella"));
    }
}
