package javaeigth.depencyInversion;

public class FileReader1 implements FileReaderInterface{

    @Override
    public void readFile() {
        System.out.println("Reading file from file 1 --- ");
    }
}
