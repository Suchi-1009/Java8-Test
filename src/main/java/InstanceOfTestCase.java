package main.java;

/**
 * A common logic that every program has is to check a certain type or structure and cast it to the desired type to perform further processing.  This involves a lot of boilerplate code.
 * Java 16, Pattern Matching for instanceof operator is a standard feature to address this issue.
 */
public class InstanceOfTestCase {

    public static void main(String[] args) {
        Student student1 = new Student(10, "Arya");

        Object obj = student1;
        if (obj instanceof Student) {
            Student address = (Student) obj;
            String name = address.getName();
            System.out.println("Student name is: "+name);
        }
    }

    static class Student {
        public int rollNo;
        public String name;

        public Student(){};

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
