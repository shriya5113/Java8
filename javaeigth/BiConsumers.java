package javaeigth;

import java.util.function.BiConsumer;

public class BiConsumers {
    //as we learnt in  consumer we can give only input not output but in biconsumer we can give 2 input sane same we can't get output
    public static void main(String[] args) {

        BiConsumer<Integer,String> biConsumer = (x,y) ->
        {
          if(y.length()  == x)
            {
                System.out.println("right");
            }
          else
            System.out.println("wrong");        };

        biConsumer.accept(2,"hi");
    }
}
