
/**
 * Write a description of RandomandArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class RandomandArray {
    
    public void simulate(int rolls){
      Random rand = new Random();
      int [ ] count = new int[13];
      
      for(int k = 0; k < rolls; k++) {
          int d1 = rand.nextInt(6) + 1;
          int d2 = rand.nextInt(6) + 1;
          System.out.println("roll is " + d1 + "  " + d2 + "    " + (d1 + d2));
          count[d1 + d2] += 1;
          
          
        }
      System.out.println("=====================================");  
      for(int i = 2; i <=12; i++) {
       System.out.println(i + "'s\t" + count[i] + "\t" + 100.0 * count[i]/rolls);
        }
        
        
        
        
        
        
        
    }

}
