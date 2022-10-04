package techademy;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Bank {
    static Scanner in = new Scanner(System.in);
    private int accountNo = 0;
    private String name = "";
    private double balance = 0;
    private String phoneNo = "";
    static Hashtable<Integer, LinkedList<Bank>> bank = new Hashtable<Integer, LinkedList<Bank>>();


    public Bank(){

    }

    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Phone No: " + phoneNo);
    }

    public LinkedList insertData(int accountNo, String name, double balance, String phoneNo) {
        LinkedList list = new LinkedList();
        list.add(name);
        list.add(balance);
        list.add(phoneNo);

        return bank.put(accountNo, list);
    }

    public void searchData(int accountNo) {
        if(bank.containsKey(accountNo)){

            Iterator it = bank.get(accountNo).iterator();
            this.accountNo = accountNo;
            this.name = (String) it.next();
            this.balance = (double) it.next();
            this.phoneNo = (String) it.next();

            System.out.println("Account No: " + accountNo);
            System.out.println("Name: " + this.name);
            System.out.println("Balance: " + this.balance);
            System.out.println("Phone No: " + this.phoneNo);
        }
        else{
            System.out.println("Account No: " + accountNo + " not found");
        }
    }

    public void withdraw(int accountNo) {
        if(bank.containsKey(accountNo)){
            Iterator it = bank.get(accountNo).iterator();
            this.accountNo = accountNo;
            this.name = (String) it.next();
            this.balance = (double) it.next();
            this.phoneNo = (String) it.next();

            System.out.print("Enter amount to withdraw: ");
            double amount = in.nextDouble();
            if(amount <= this.balance){
                double currBal = this.balance - amount;
                System.out.println("Amount withdrawn successfully");
                System.out.println("Balance: " + currBal);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Invalid amount");
        }

    }


}

class Data extends Bank {

    public static void main(String[] args) {

        Data b = new Data();
        LinkedList list = new LinkedList();

        list.add(b.insertData(123457, "John Toms", 1000, "1234567890"));
        list.add(b.insertData(123458, "Jack New", 2000, "1234567891"));
        list.add(b.insertData(123459, "Jayson Thorn", 3000, "1234567892"));
        list.add(b.insertData(123460, "Michelle Dey", 4000, "1234567893"));
        list.add(b.insertData(123461, "Ruth Chris", 5000, "1234567894"));
        list.add(b.insertData(123462, "Mike Tomphson", 6000, "1234567895"));
        list.add(b.insertData(123463, "Angela Jones", 7000, "1234567896"));
        list.add(b.insertData(123464, "Zeno Albert", 8000, "1234567897"));
        list.add(b.insertData(123465, "Brian Jack", 9000, "1234567898"));
        list.add(b.insertData(123466, "Charlie Puth", 10000, "1236782939"));
        list.add(b.insertData(123467, "France Lance", 11000, "1236782940"));
        list.add(b.insertData(123468, "Garry Smith", 12000, "1236782941"));

        System.out.print("Enter Account No: ");
        int accNo = in.nextInt();
        b.searchData(accNo);


        System.out.print("\n\nDo you want to make withdrawal? (y/n): ");
        char ch = in.next().charAt(0);
        if (ch == 'y') {
            b.withdraw(accNo);
        }
        else{
            System.out.println("Thank you for using our service");
        }
    }

}