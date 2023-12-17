import java.util.Scanner;

public class GradeBook {
  private String courseName;
  private int courseCode;
  private int counter;
  private int total;
  private int aCount;
  private int bCount;
  private int cCount;
  private int dCount;
  private int eCount;
  private int fCount;

  public void setCourseName(String nameOfCourse) {
    courseName = nameOfCourse;
  }

  public void setCourseCode(int codeOfCourse) {
    courseCode = codeOfCourse;
  }

  public String getCourseName() {
    return courseName;
  }

  public int getCourseCode() {
    return courseCode;
  }

  public void displayGradeReport() {
    System.out.println("Grade Report");
    if (counter != 0) {
      double average = (double) total / counter;
      System.out.printf("Total of the %d Grades Entered is: %d\n", counter, total);
      System.out.printf("The Average is:%.2f%n", average);
      System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d",
          "Number of Students Who received each grades: ",
          "A: ", aCount,
          "B: ", bCount,
          "C: ", cCount,
          "D: ", dCount,
          "E: ", eCount,
          "F: ", fCount);
    } else {
      System.out.println("No Grades were Entered");
    }

  }

  public void inputGrades() {
    Scanner input = new Scanner(System.in);
    int grade;

    System.out.printf("%s\n%s\n %s\n %s\n",
        "Enter Grade From Range of 0-100",
        "Type End of File indicator to terminate input: ",
        "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter");
    while (input.hasNext()) {
      grade = input.nextInt();
      total += grade;
      counter++;
      incrementLetterGradeCounter(grade);
    }
  }

  private void incrementLetterGradeCounter(int grade) {
    switch (grade / 10) {

      case 9:
      case 10:
        aCount++;
        break;
      case 8:
        bCount++;
        break;
      case 7:
        cCount++;
        break;
      case 6:
        dCount++;
        break;
      case 5:
        eCount++;
        break;
      default:
        fCount++;
        break;
    }
  }

}
