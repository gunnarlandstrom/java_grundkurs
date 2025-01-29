public class MiunCourse {
    private String miunCourseName = "Hello";
    private String miunCourseCode = "To";
    private String miunCoursePoints = "You";
    private String miunCourseDescription = "Sir";


    // Course code Set/Get
    public boolean setMiunCourseCode(String input) {

        this.miunCourseCode = input;

        return true;
    }

    public String getMiunCourseCode(String input) {

        return miunCourseCode;
    }

    // Course name Set/Get
    public boolean setMiunCourseName(String input) {
        this.miunCourseName = input;
        return true;
    }

    public String getMiunCourseName() {

        return miunCourseName;
    }

    // Course points Set/Get
    public boolean setMiunCoursePoints(String input) {
        this.miunCoursePoints = input;
        return true;
    }

    public String getMiunCoursePoints() {
        return miunCoursePoints;
    }

    // Course Description Set/Get
    public boolean setMiunCourseDescription(String input) {
        this.miunCourseDescription = input;
        return true;
    }

    public String getMiunCourseDescription(){
        return miunCourseDescription;
    }

    public void printCourseInfo(){
        System.out.println("Coursename: " + miunCourseName);
        System.out.println("Course code: " + miunCourseCode);
        System.out.println("Course points: " + miunCoursePoints);
        System.out.println("Course description: " + miunCourseDescription);
        System.out.println();
    }

}
