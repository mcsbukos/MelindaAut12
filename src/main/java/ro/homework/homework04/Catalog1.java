package ro.homework.homework04;


import ro.homework.homework04.Student;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Catalog1 {
    public static void main(String[] args) {

        //Create an empty HashSet
        HashSet<Student> h_Set = new HashSet<Student>();

        //Adding students
        h_Set.add(new Student("Maria", "Toma", 7.81));
        h_Set.add(new Student("Ion", "Vasilescu", 6.55));
        h_Set.add(new Student("Radu", "Tudor", 8.16));
        h_Set.add(new Student("Stefan", "Adam", 8.85));
        h_Set.add(new Student("Ana", "Telecan", 7.95));

        //Displaying the students
        System.out.println("\n The hash set: ");
        for (Student student : h_Set) {
            System.out.println(student);
        }
        // Searching a student by the last name
        String lastnameToSearch = "Tudor";
        Student studentToSearch = null;
        for (Student student : h_Set) {
            if (student.getLastName().equals(lastnameToSearch)) {
                studentToSearch = student;
            }
        }
        if (studentToSearch != null)
            System.out.println("\n The searched student is: " + studentToSearch);


        // Removing a student by last name
        String lastnameToRemove = "Vasilescu";
        Student studentToRemove = null;
        for (Student student : h_Set) {
            if (student.getLastName().equals(lastnameToRemove)) {
                studentToRemove = student;
            }
        }
        if (studentToRemove != null)
            h_Set.remove(studentToRemove);

        //Displaying the students after deleting one
        System.out.println("\n The hash set after deleting one student: ");
        for (Student student : h_Set) {
            System.out.println(student);
        }

        // Sort and display the students by average and then by last name
        System.out.println("\n The sorted set by average and last name: ");
        TreeSet<Student> sortedSetByAverage = sortByAverage(h_Set);
        for (Student student : sortedSetByAverage) {
            System.out.println(student);
        }

        System.out.println("\n The sorted set by last name: ");
        TreeSet<Student> sortedSetByLastName = sortByLastName(h_Set);
        for (Student student : sortedSetByLastName) {
            System.out.println(student);
        }
    }

    public static TreeSet<Student> sortByAverage(HashSet<Student> students) {
        TreeSet<Student> sortedSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Compare by average in descending order
                return Double.compare(s2.getAverage(), s1.getAverage());
            }
        });
        sortedSet.addAll(students);
        return sortedSet;
    }

    public static TreeSet<Student> sortByLastName(HashSet<Student> students) {
        TreeSet<Student> sortedSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Compare by last name in ascending order
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
        sortedSet.addAll(students);
        return sortedSet;
    }
}
