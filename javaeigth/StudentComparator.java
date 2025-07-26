package javaeigth;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;

public class StudentComparator {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(103, "Charlie"));
        students.add(new Student(102, "Bob"));

        System.out.println("Before sorting: " + students);

        // Sort by roll number using Comparable (natural ordering)
        // No lambda needed here, as Comparable is implemented by the Student class
        Collections.sort(students);
        System.out.println("Sorted by roll number: " + students);

        // Sort by name using a Comparator with a lambda expression
        Comparator<Student> byName = (s1, s2) -> s1.getName().compareTo(s2.getName());
        students.sort(byName); // Using the sort method added to List in Java 8
        System.out.println("Sorted by name: " + students);

        // Sort by name in reverse order using a Comparator with a lambda expression
        // and the reversed() method
        Comparator<Student> byNameReversed = byName.reversed();
        students.sort(byNameReversed);
        System.out.println("Sorted by name in reverse order: " + students);

        // Sort by name, then by roll number, using a chain of Comparators with method references
        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getRollNumber));
        System.out.println("Sorted by name, then by roll number: " + students);
    }
}
