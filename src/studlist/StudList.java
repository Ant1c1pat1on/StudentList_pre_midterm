/* Sup now b**/
package studlist;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] sList=new Student[2];//declaration of arrays of objects
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<=sList.length-1;i++)
        {
            sList[i]=new Student();//initialize the object
            System.out.println("Enter student name: ");
            sList[i].setName(input.nextLine());//store value into the array of objects
                    
        }
        
        for(int i=0;i<=sList.length-1;i++)
        {
            System.out.println("Student name: "+sList[i].getName());
        }
    }

}
