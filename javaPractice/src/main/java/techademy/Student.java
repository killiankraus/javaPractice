package techademy;

class Academic{
    private double physicsGrade, chemGrade, bioGrade = 0;
    String name = "";
    int rollNo = 0;
    String phoneNo = "";

    public void insert(String name, int rollNo, String phoneNo){
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public double getChemGrade() {
        return chemGrade;
    }

    public void setChemGrade(double chemGrade) {
        this.chemGrade = chemGrade;
    }

    public double getBioGrade() {
        return bioGrade;
    }

    public void setBioGrade(double bioGrade) {
        this.bioGrade = bioGrade;
    }

    public void getGrades(){
        double grade = (physicsGrade + chemGrade + bioGrade) / 3;
        System.out.println("Total Grade: " + grade);
    }

    public void display(){
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Phone No: " + phoneNo + "\n");
    }
}
public class Student extends Academic{
    public static void main(String[] args) throws Exception {
        Student n = new Student();
        n.insert("Frank Gavina", 198086 , "09971508777");
        n.setPhysicsGrade(90);
        n.setChemGrade(80);
        n.setBioGrade(70);
        n.display();
        n.getGrades();
    }
}
