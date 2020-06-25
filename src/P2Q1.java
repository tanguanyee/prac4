
/**
 *
 * @author TARUC
 * NAme : TGY
 */
public class P2Q1 {
    
    //this function going to display sqrt value from 0 - max
    public static void displaySquareRoot(int max){
        
        System.out.println("Number   SquareRoot");
        
        for(int i=0; i<=max; i+=2){
            
            System.out.printf("%d \t %.4f\n" , i , Math.sqrt(i));
            
        }
        
    }
    
    public static void main(String[] args) {
        displaySquareRoot(20);
      
    }
}