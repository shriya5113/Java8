
    interface Printer {
        void print(String message);
        default void printUpperCase(String message) {
            System.out.println(message.toLowerCase());
        }
    }

    class PrinterImpl implements Printer {
        @Override
        public void print(String message) {
            System.out.println(message);
        }

        @Override
        public void printUpperCase(String message) {
            System.out.println(message.toUpperCase());
        }
    }

    public class DefaultMethodss {
        public static void main(String[] args) {
            Printer printer = new PrinterImpl();
            printer.print("Hello, World!");  // Output: Hello, World!
            printer.printUpperCase("Hello, World!");  // Output: HELLO, WORLD!
        }
    }
    
