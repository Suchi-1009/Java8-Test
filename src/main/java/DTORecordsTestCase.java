package main.java;

/**
 * Data Transfer Objects (DTO) are useful when passing data between objects. However, creating a DTO comes with a lot of boilerplate code such as fields, constructors, getters/setters, equals(), hashcode(), and toString() methods:
 * Records - which are a special kind of class that can define immutable data objects in a much more compact way and identical to Project Lombok
 */

public class DTORecordsTestCase {

    public static void main(String[] args) {
        Student student1 = new Student(10, "Arya");
        Student student2 = new Student(20, "Suchi");

        System.out.println("Roll No. value  : " + (student1.getRollNo() == 10 ? " is Matching" :" not matching"));
        System.out.println("Name No. value  : " + (student2.getName().equals("Arya") ? "is Matching" :"not matching"));

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
