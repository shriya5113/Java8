package javaeigth;

import java.util.Arrays;
import java.util.List;

//static method reference

public class MethodReference {


    public static void main(String[] args) {
            // Using method reference for a static method
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
            numbers.forEach(num -> System.out.println(MathOperations.square(num)));  // Using lambda expression
            numbers.forEach(MathOperations::square);  // Method reference


        Printers printer = new Printers();
        // Using method reference for an instance method
        List<String> messages = Arrays.asList("Hello", "World");
        messages.forEach(printer::printMessage);  // Method reference to an instance method
        }
    }

class MathOperations {
    public static int square(int x) {
        return x * x;
    }
}

//    Instance Method Reference (Non-static): If you reference an instance method,
//    it requires an object reference to call the method.
class Printers {
    public void printMessage(String message) {
        System.out.println(message);
    }
}
