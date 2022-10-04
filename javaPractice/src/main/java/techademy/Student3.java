package techademy;

import java.util.Hashtable;
import java.util.Map;

public class Student3 {
    int nollNo;
    String name;
    String phoneNo;


    public Student3(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public static void main(String[] args) {
        Map<Integer, Student3> student = new Hashtable<Integer, Student3>();
        student.put(123456, new Student3("John Doe", "1234567890"));
        student.put(123457, new Student3("Jack New", "1234567891"));
        student.put(123458, new Student3("Jayson Thorn", "1234567892"));
        student.put(123459, new Student3("Michelle Dey", "1234567893"));

        for(Map.Entry<Integer, Student3> entry : student.entrySet()){
            int key = entry.getKey();
            Student3 s = entry.getValue();
            System.out.println("\nStudent No: " + key);
            System.out.println("Name: " + s.name);
            System.out.println("Phone No: " + s.phoneNo);
        }
    }
}
