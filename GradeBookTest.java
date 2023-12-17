import java.util.Scanner;

public class GradeBookTest{
    public static void main(String [] args){
        Scanner courseInput = new Scanner(System.in);
        System.out.println("Please Enter Your Course Title: ");
        String usersCourse = courseInput.nextLine();
        GradeBook myGradeBook  = new GradeBook();
        

        
        myGradeBook.setCourseName(usersCourse);
        System.out.print("\n");
        myGradeBook.setCourseCode(202);
        myGradeBook.inputGrades();
        System.out.print("\n");
        myGradeBook.displayGradeReport();

        
        courseInput.close();
    }
}
