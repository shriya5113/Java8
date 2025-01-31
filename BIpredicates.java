import java.util.function.BiPredicate;

public class BIpredicates {
    public static void main(String[] args) {
        //it is same as predicate but in predicate we give one input and it return booleans while in bi-predicate
        // we can give two inputs

        BiPredicate <Integer,Integer> biPredicate = (x,y) -> x.equals(y);

        System.out.println(biPredicate.test(2,2));//true
    }
}
