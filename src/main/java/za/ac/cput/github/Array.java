

package za.ac.cput.github;

/**
 *
 * @author ondela
 */
public class Array {

 public static void main(String[] args) {

/**
 *
 * @author ondela

   This method counts the arrays then the total and max
 */
       
        double [] myList = {1.9, 2,9, 3.4, 3,5};
        
        for (int i=0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        
        double total = 0;
        for (int i = 0; i<myList.length; i++){
            total +=myList[i];
        }
        System.out.println("Total is" + total);
        
        double max = myList[0];
         for (int i = 0; i<myList.length; i++){
            if(myList[i] >max)max=myList[i];
         }
         System.out.println("Max is" + max);
    }
    

}
