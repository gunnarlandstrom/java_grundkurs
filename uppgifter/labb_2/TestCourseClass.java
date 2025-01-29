import javax.swing.JOptionPane;

public class TestCourseClass {
    public static void main(String[] args){

        //Ceates course object one.
        MiunCourse courseOne = new MiunCourse();

        courseOne.setMiunCourseName("Datateknik - Java");
        courseOne.setMiunCourseCode("DT196G");
        courseOne.setMiunCoursePoints("7.5 HP");
        courseOne.setMiunCourseDescription("In this course you improve your knowledge in coding so your future as a codemonkey is saved.");
    
        courseOne.printCourseInfo();

        
        //Creates course object two.
        MiunCourse courseTwo = new MiunCourse();

        String userInputCourseName;
        String userInputCourseCode;
        String userInputCoursePoints;
        String userInputCourseDescription;

        userInputCourseName = JOptionPane.showInputDialog("What course do you attend? ");
        userInputCourseCode = JOptionPane.showInputDialog("What code does the corse have? ");
        userInputCoursePoints = JOptionPane.showInputDialog("How many points is the course? ");
        userInputCourseDescription = JOptionPane.showInputDialog("Type a short description of the course: ");
    
        courseTwo.setMiunCourseName(userInputCourseName);
        courseTwo.setMiunCourseCode(userInputCourseCode);
        courseTwo.setMiunCoursePoints(userInputCoursePoints);
        courseTwo.setMiunCourseDescription(userInputCourseDescription);

        courseTwo.printCourseInfo();
    
    }
}
