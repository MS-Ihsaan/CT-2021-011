package Q_05;

public class Main {
    public static void main(String[] args) {
        Course oop = new Course();
        oop.setCourseName("Object oriented programming");
        oop.setCourseCode("CTEC 22043");

        Lecturer kumar = new Lecturer();
        kumar.setLecturerName("Kumar");
        kumar.setCourseTeaching("Object oriented programming");

        Student sanga = new Student();
        sanga.setStudentName("Sanga");
        sanga.setDegreeName("ICT");
        sanga.setCourseFollowing("Object oriented programming");

        oop.setLecturer(kumar);

        System.out.println("Student details: ");
        System.out.println("Student Name: "+sanga.getStudentName());
    }
}
