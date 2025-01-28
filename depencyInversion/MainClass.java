package depencyInversion;

public class MainClass {
    public static void main(String[] args) {
        // Creating a FileReader object and passing it to FileManager
        FileReaderInterface fileReader = new FileReader();
        FileReaderInterface fileReader1 = new FileReader1();

        FileManager fileManager = new FileManager(fileReader);
        FileManager fileManager1 = new FileManager(fileReader1);

        fileManager.manageFile();  // Output: Reading file...
        fileManager1.manageFile(); //Reading file from file 1 --
    }
}
//    The Dependency Inversion Principle (DIP) is a key design principle that helps decouple high-level and low-level modules,
//    making your
//    system more flexible, testable, and maintainable. It promotes the use of abstractions (interfaces or abstract classes) to
//    avoid direct dependencies between components, allowing changes to low-level details without affecting high-level logic.