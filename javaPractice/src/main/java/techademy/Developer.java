package techademy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class develop {
    static ArrayList list2 = new ArrayList();
    int empNo;
    String empName;
    String projName;
    String phoneNo;

    public develop(){
        empNo = 0;
        empName = "";
        projName = "";
        phoneNo = "";
    }
    public ArrayList insertData(int empNo, String empName, String projName, String phoneNo){
        list2.add(empNo);
        list2.add(empName);
        list2.add(projName);
        list2.add(phoneNo);

        return list2;
    }

    public void display(){
        Iterator it = list2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void searchData(int empNo){
        Iterator it = list2.iterator();
        while(it.hasNext()){
            if(it.next().equals(empNo)){
                System.out.println("Employee : " +  empNo);
                System.out.println("Name: " + it.next());
                System.out.println("Project: " + it.next());
                System.out.println("Phone: " + it.next());
            }
        }
        System.out.println("Employee No: " + empNo + " not found");
    }

}

public class Developer extends develop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Developer dev = new Developer();

        dev.insertData(123457, "John Doe", "Project 1", "1234567890");
        dev.insertData(123458, "Jack New", "PLDT", "1234567891");
        dev.insertData(123459, "Jayson Thorn", "OPTUS", "1234567892");
        dev.insertData(123460, "Michelle Dey", "GLOBE", "1234567893");
        dev.insertData(123461, "Ruth Chris", "SRE", "1234567894");
        dev.insertData(123462, "Mike Tomphson", "OPTUS", "1234567895");
        dev.insertData(123463, "Angela Jones", "GLOBE", "1234567896");
        dev.insertData(123464, "Zeno Albert", "SMART", "1234567897");
        dev.insertData(123465, "Brian Jack", "OPTUS", "1234567898");
        dev.insertData(123466, "Charlie Puth", "SRE", "1236782939");
        dev.insertData(123467, "France Lance", "GLOBE", "1236782940");
        dev.insertData(123468, "Garry Smith", "OPTUS", "1236782941");


        System.out.print("Enter employee number: ");
        int empNo = in.nextInt();
        dev.searchData(empNo);
    }

}
