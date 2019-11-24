import java.util.Scanner;
import java.util.ArrayList;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_WEIGHTS = 5;                               // Number of elements in array
      ArrayList<Double> userVals = new ArrayList<Double>();    // User numbers
      double sumVal;
      double averageVal;
      double maxVal;
      int i;
      
      // Get user numbers and add to userVals
      for (i = 0; i < NUM_WEIGHTS; ++i) {
         System.out.println("Enter weight " + (i + 1) + ": ");
         userVals.add(scnr.nextDouble());
      }
      
      System.out.println();
      
      System.out.print("You entered: ");
      for (i = 0; i < NUM_WEIGHTS; ++i) {
         System.out.print(userVals.get(i) + " ");
      }   
       
      System.out.println();
       
      // Output total weight
      sumVal = 0.0;
      for (i = 0; i < userVals.size(); ++i) {
         sumVal = sumVal + userVals.get(i);                 // Calculate sum of all numbers
      }
      System.out.println("Total weight: " + sumVal);
      
      // Determine average value
      averageVal = sumVal / userVals.size();                // Calculcate average
      System.out.println("Average weight: " + averageVal);
      
      // Determine max weight
      maxVal = userVals.get(0);                                 // Largest so far
      for (i = 0; i < userVals.size(); ++i) {
         if (userVals.get(i) > maxVal) {
            maxVal = userVals.get(i);
         }
      }   
      System.out.println("Max weight: " + maxVal);
      
      return;
   }
}
