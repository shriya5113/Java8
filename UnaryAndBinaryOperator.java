import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperator {
    public static void main(String[] args) {
        // In unary operator working as same in function but difference was that in function we give 2 parameter i.e one i/p datattype and another
        //one show o/p of datatype if both are same data type we can use unary operator

        UnaryOperator<String> stringUrnary = str -> {
            str = str.replace("+91","").replace("-","");
            return str;
        };
        System.out.println(stringUrnary.apply("+91980323-0515")); //9803230515

         // In binary operator working as same in bi-function but difference was that in bi-function we give 3 parameter i.e two i/p
        // datattype and another
        //one show o/p of datatype if all are same data type we can use unary operator
        BinaryOperator<String> binaryOperator = (x,y) ->
        {
             if(x.compareToIgnoreCase(y) == -1)
             {
                 return x;
             }


            return y;
        };

        System.out.println(binaryOperator.apply("shriya","SHRIYA"));
    }
}
