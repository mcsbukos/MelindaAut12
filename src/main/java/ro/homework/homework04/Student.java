package ro.homework.homework04;

public class Student {
    private String firstName;
    private String lastName;
    private double average;

    public Student(String firstName, String lastName, double average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.average = average;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", average=" + average +
                '}';
    }

    public String getLastName() {
        return lastName;
    }
    public double getAverage() {
        return average;
    }
}
