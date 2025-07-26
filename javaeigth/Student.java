package javaeigth;

public class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Natural ordering based on rollNumber
    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.rollNumber, otherStudent.rollNumber);
    }
}
