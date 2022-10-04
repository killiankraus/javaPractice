package techademy;

public class Student1 extends Academic1{

    private int rollNo;
    private String name;


    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setRollNo(1329);
        s1.setName("John");
        s1.setPhysicsGrade(90);
        s1.setChemGrade(80);
        s1.setBioGrade(70);
        s1.display();

    }

    public int setRollNo(int rollNo) {
        return this.rollNo = rollNo;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public void display(){
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        getGrades();
    }

}


class Academic1{
    private double physicsGrade, chemGrade, bioGrade = 0;

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public void setChemGrade(double chemGrade) {
        this.chemGrade = chemGrade;
    }

    public void setBioGrade(double bioGrade) {
        this.bioGrade = bioGrade;
    }

    public void getGrades(){
        double grade = (physicsGrade + chemGrade + bioGrade) / 3;
        System.out.println("Total Grade: " + grade);
    }


}