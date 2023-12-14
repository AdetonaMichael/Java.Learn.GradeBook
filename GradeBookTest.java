import java.util.Scanner;

public class GradeBookTest{
    public static void main(String [] args){
        Scanner courseInput = new Scanner(System.in);
        System.out.println("Please Enter Your Course Title: ");
        String usersCourse = courseInput.nextLine();
        GradeBook myGradeBook  = new GradeBook();
        

        
        myGradeBook.setCourseName(usersCourse);
        System.out.println("Student Course Set Successfully...");
        myGradeBook.setCourseCode(202);
        System.out.println("The Course Code has Been Set Successfully...");

        System.out.println("Showing Message. ");
        myGradeBook.showCourseInformation();

        
        courseInput.close();
    }
}
