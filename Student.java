public class Student {
    // fields or attributes
    private String firstname;
    private String lastname;
    // student's id contains at least 7 digits, e.g: 9931078
    private String id;
    private double grade;
    // constructor
    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        // assuming that the student's grade is zero
        grade = 0;
    }
    // methods
    public void printStudentInfo () {
        if (grade > 20 | grade < 0) {
            System.out.println("Invalid Grade");
        }
        if ( id.length()!= 7 ){
            System.out.println("Invalid ID");
        }
        else {
            System.out.println(firstname + " " + lastname + "\nID:  " + id + "\nGRADE: " + grade);
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}