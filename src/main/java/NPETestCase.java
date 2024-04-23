package main.java;

/**
 * NullPointerExceptions (NPEs) are very common exceptions that every developer faces. In most cases, the error messages thrown by the compiler aren’t useful for identifying the exact object which is null.
 * From Java 15, "-XX:+ShowCodeDetailsInExceptionMessages" flag is enabled by default.
 */
public class NPETestCase {

    public static void main(String[] args) {

        Student student1 = new Student(10, "");
        Student student2 = new Student();

        student1.getName().toLowerCase();
        student2.getName().toLowerCase();
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
