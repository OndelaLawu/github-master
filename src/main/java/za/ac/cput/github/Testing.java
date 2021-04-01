/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.github;

/**
 *
 * @author
 */
public class Testing {
/**
 *
 * @author ondela
   Adding arrays to the method

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
