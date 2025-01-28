import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        //no arg just return the o/p only one method is defined
        Supplier<String> supplier = () -> "shriya";
//        System.out.println(supplielier.get());
        Consumer<String> consumer = str -> System.out.println(str);
        Predicate<String> predicate = str -> str.contains("IY");
        Function<String,String> function = str -> str.toUpperCase();

        if (predicate.test(function.apply(supplier.get())))
        {
            consumer.accept(function.apply(supplier.get()));
        }


    }
}
