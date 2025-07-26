package javaeigth;

import java.util.function.BiFunction;

public class BIFuntions {
    public static void main(String[] args) {
        //IT IS SAME as funtion but in funtion we take one input and other one is output but in bifunction
        // we can take 2 i/o and one is o/p

       BiFunction <String,String,Integer> biFuntions = (x, y)  -> x.length()+y.length();

        System.out.println(biFuntions.apply("shriya","hello"));


    }
}
