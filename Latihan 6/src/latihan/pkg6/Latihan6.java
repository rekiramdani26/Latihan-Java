/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg6;

/**
 *
 * @author Reki Ramdani
 */
public class Latihan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double grade = 92.0;
        
        if( grade >= 90 ){
            System.out.println( "Excellent!" );    
        }
        else if( (grade < 90) && (grade >= 80)){
            System.out.println("Good job!");
        }
        else if( (grade < 80) && (grade >= 60)){
            System.out.println("Study hearder!");
        }
        else{
            System.out.println("Sorry, you failed.");
        }
    }
}
