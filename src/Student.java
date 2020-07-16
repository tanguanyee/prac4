
/**
 *
 * @author USER
 */
public class Student {
    
    private String studentID;
    private String studentName;
    private int quizCount;
    private int totalScore;  
    private static double contribution;
    
    //constructor overloading
    public Student(){
        this("","");
    }

    /*Q2
    public Student(String id, String name) {
        studentID = id;
        studentName = name;
    }*/

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    
    //set
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public static void setContribution (double contribution){
        Student.contribution = contribution;
    }
    
    //get
    public static double getContribution (){
       return contribution;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getQuizCount() {
        return quizCount;
    }

    public int getTotalScore() {
        return totalScore;
    }
    
    public void addQuiz(int score){
        if (score < 0 || score > 10){
            System.out.println("Error : Invalid score");
        }else{
            totalScore += score;
            quizCount++;
        }
    }
    
    public double getAverageScore(){
        return totalScore/(double)quizCount;
    }
}
