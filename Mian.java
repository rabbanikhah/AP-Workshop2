public class Mian {
    public static void main ( String[] args) {
        Student std1 = new Student("James", "Gosling", "0987654");
        Student std2 = new Student("Dennis", "Ritchie", "1234567");

        std1.setGrade(18);
        std2.setGrade(17.5);
        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab class1 = new Lab("Mr.Smith","Monday", 30);
        // enroll students
        class1.enrollStudent(std1);
        class1.enrollStudent(std2);
        // calculate average grade
        class1.calAvg();
        class1.printLabInfo();
    }
}
