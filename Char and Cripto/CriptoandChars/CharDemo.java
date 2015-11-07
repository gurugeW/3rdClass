
/**
 * Write a description of CharDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CharDemo {
    public void digitTest() {
        String test = "ABCabc12345678 ; ' .,#`!\"";
        System.out.println("Testing " + test);
        for(int k = 0; k < test.length(); k++) {
         char ch = test.charAt(k); 
         if(Character.isDigit(ch)){
             System.out.println(ch+ " is a digit");
            }
         else if (Character.isAlphabetic(ch)){
             System.out.println(ch+ " is a alphabecic");
            }
         else if (ch == '#') {
             System.out.println( ch+ " is a hashtag");
            }
         else System.out.println("_"  );   
        }

    }
    
}
