package Student;

public class StudentResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstSemester std1 = new FirstSemester("Sam", 127, 149);// Sam roll and registration number
        std1.setMarks(60,70);// set Sam marks
        System.out.println("\nEnter First Semester Student's Info:");
        std1.getSubject();
        std1.showResult();
        
        SecondSemester std2 = new SecondSemester("Peter", 227, 249);// Peter roll and registration number
        std2.setMarks(70,80);// set Peter marks
        System.out.println("\n\nEnter Second Semester Student's Info:");
        std2.getSubject();
        std2.showResult();
    }
}
