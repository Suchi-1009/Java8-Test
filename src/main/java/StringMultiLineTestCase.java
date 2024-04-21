package main.java;

/**
 * Before Java 15, embedding multi-line code snippets will require explicit line terminators, String concatenations, and delimiters. To address this, Java 15 introduced text blocks that allow us to embed code snippets and text sequences more or less as-is. This is particularly useful when dealing with literal fragments such as HTML, JSON, and SQL.
 *
 * A text block is an alternative form of String representation that can be used anywhere a normal double-quoted String literal can be used. For instance, a multi-line String literal can be represented without explicit usage of line terminators and String concatenations:
 */
public class StringMultiLineTestCase {

    public static void main(String[] args) {

        String sql = "SELECT employee.ID, employee.Name, employee.Email\n" +
                "FROM employee \n" +
                "JOIN dept\n" +
                "WHERE\n" +
                "employee.ID = dept.hodId";


        System.out.println("Multi-line SQL : "+sql);
    }
}
