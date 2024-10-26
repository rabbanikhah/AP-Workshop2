public class Lab {
    // fields or attributes
    private Student[] students;
    private String teacherName;
    // the day in which this lab is held
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    // constructor
    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        // create an array of students with the size of "maxSize"
        students = new Student[maxSize];
    }
    // methods
    public void enrollStudent(Student a) {
        // add new student
        currentSize = 0;
        students[currentSize] = a;
        currentSize++;
    }
    public void calAvg (){
        double sumGrades = 0;
        for ( int i = 0; i < maxSize; i++){
            sumGrades += students[i].getGrade();
        }
        avgGrade = sumGrades / maxSize;
    }

    public void printLabInfo(){
        System.out.println(teacherName + "\n" + dayOfWeek + "\n" + "AVERAGE :" + avgGrade);
        for ( int j = 0; j < maxSize; j++){
            students[j].printStudentInfo();
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
