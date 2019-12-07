/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;

/**
 *
 * @author Reki Ramdani
 */
public class Latihan48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String status = "";
int grade = 80;
//mendapatkan status pelajar
status = (grade >= 60)?"Passed":"Fail";
//print status
System.out.println( status );
    }
}
