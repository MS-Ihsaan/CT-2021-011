package Q_05;

public class Course {
    //Data members
    private String courseName;
    private String getCourseCode;
    private Lecturer lecturer;

    //getter method for CourseName
    public String getCourseName() {
        return courseName;
    }

    //setter method for CourseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //getter method for CourseCode
    public String getCourseCode() {
        return getCourseCode;
    }

    //setter method for CourseCode
    public void setCourseCode(String getCourseCode) {
        this.getCourseCode = getCourseCode;
    }

    //getter method for Lecturer
    public Lecturer getLecturer() {
        return lecturer;
    }

    //setter method for lecturer
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
