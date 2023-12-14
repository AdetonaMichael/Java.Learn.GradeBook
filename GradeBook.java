public class GradeBook{
  private String courseName;
  private int courseCode;

  public void setCourseName(String nameOfCourse){
    courseName = nameOfCourse;
  }
  public void setCourseCode(int codeOfCourse){
    courseCode = codeOfCourse;
  }

  public String getCourseName(){
    return courseName;
  }
  public int getCourseCode(){
    return courseCode;
  }
  public void showCourseInformation(){
    System.out.printf("Welcome To Your Grade Book\n Your Course Title is: \n%s and your course code is \n%d", getCourseName(), getCourseCode());
  }
}
