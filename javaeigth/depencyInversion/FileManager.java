package javaeigth.depencyInversion;

public class FileManager{
    private FileReaderInterface fileReader;

    // Constructor injection: Dependency is injected through constructor
    public FileManager(FileReaderInterface fileReader) {
        this.fileReader = fileReader;
    }

    public void manageFile() {
        fileReader.readFile();  // Now uses the abstraction, not a concrete class
    }
}
