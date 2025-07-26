package javaeigth;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        //no arg just return the o/p only one method is defined
        Supplier<String> supplier = () -> "shriya";
//        System.out.println(supplielier.get());
        Consumer<String> consumer = System.out::println;
        Predicate<String> predicate = str -> str.contains("IY");
        Predicate<String> predicate1 = str -> str.contains("Sh");

        Function<String,String> function = String::toUpperCase;

        if (predicate.or(predicate1).test(function.apply(supplier.get())))
        {
            consumer.accept(function.apply(supplier.get()));
        }


    }
}
