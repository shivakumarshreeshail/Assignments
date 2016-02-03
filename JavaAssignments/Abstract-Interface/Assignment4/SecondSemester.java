package Student;


public class SecondSemester extends Student implements Result {
    private String sub1, sub2;
    private Float mark1, mark2, grade1, grade2,credit1,credit2;
    
    public SecondSemester(String name, int roll, int reg) {
        super(name, roll, reg);
    }
    @Override
    public void setMarks(float mark1,float mark2) {
        this.mark1=mark1;
        this.mark2=mark2;
        this.grade1=markToGrade(mark1);
        this.grade2=markToGrade(mark2);
    }
     @Override
    public float calculateGpa() {
        return (grade1* credit1+ grade2*credit2) / (credit1+credit2);
    }

    @Override
    public void getSubject() {
        sub1="Data Structure";
        sub2="Discrete Mathematics";
        credit1=(float)3.0;
        credit2=(float)2.0;
    }

    @Override
    public void showResult() {
        System.out.println("\nName: " + name + "\nRoll = " + roll + "\nRegistration no: " + reg + "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2 + "\nGPA: " + calculateGpa());
    }
}
