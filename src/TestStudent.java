
/**
 *
 * @author USER
 */
public class TestStudent {
    
    public static void main(String[] args) {
        //declare 2 student object
        Student s1 = new Student();
        Student s2 = new Student("W45678","Abu");

        //set name and id for s1
        s1.setStudentName("Ali");
        s1.setStudentID("W12345");

        s1.addQuiz(10);
        s2.addQuiz(5);
        
        s1.setContribution(20);

        System.out.printf("%-10s %s %s %s %s\n",
                "Name", "No.Quiz", "Score", "Average", "Contribution");
        
        System.out.printf("%-12s %5d %5d %7.2f %12.2f\n",
                s1.getStudentName(),s1.getQuizCount(),
                s1.getTotalScore(),s1.getAverageScore(),
                s1.getAverageScore()/10 * Student.getContribution()
        );

        System.out.printf("%-12s %5d %5d %7.2f %12.2f\n",
                s2.getStudentName(),s2.getQuizCount(),
                s2.getTotalScore(),s2.getAverageScore(),
                s1.getAverageScore()/10 * Student.getContribution()
        );

    }
    
}
