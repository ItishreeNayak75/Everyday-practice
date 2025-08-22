import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // toString method for printing
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

public class StudentCollection {
    public static void main(String[] args) {
        // Create ArrayList of Students
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Alice", 85));
        students.add(new Student(102, "Bob", 92));
        students.add(new Student(103, "Charlie", 78));
        students.add(new Student(104, "David", 92));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by marks (descending)
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks;
            }
        });

        System.out.println("\nSorted by Marks (High to Low):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name (alphabetical)
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("\nSorted by Name (A-Z):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
