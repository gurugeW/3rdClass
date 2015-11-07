import edu.duke.*;
public class CaeserCipher {
    
    
    
    
    
    
    
    public String encryptTwoKeys(String input, int key1, int key2){
        StringBuilder sb = new StringBuilder();
         String s1 = encrypt(input,key1);
         String s2 = encrypt(input,key2);
         
        for(int i = 0; i < input.length(); i++ ){
              
            if( (i % 2)>= 1 ){  
            sb.append( s2.charAt(i));   
             // encrypt (currChar, key1);
            }else
            { 
            sb.append(s1.charAt(i));
            }
                       
        }   
        
      return sb.toString();
       
    }
    
    public void testEncryptTwoKey(){
     System.out.println(encryptTwoKeys(
     "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21));  
        
    }
    
    public String encrypt(String input, int key) {
        
        // Make a String builder with message 
        StringBuilder encrypted = new StringBuilder(input);
        //write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
        //compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + 
            alphabet. substring(0, key);
          // go through each letter of encrypte message
        for(int i = 0; i < encrypted.length(); i++ ) {
           boolean lower = false;
           char currChar = encrypted.charAt(i);
           if(Character.isLowerCase(currChar)){
               lower = true; 
               currChar = Character.toUpperCase(currChar);
            }
           //find locaton of Ith char
           int idx = alphabet.indexOf(currChar);
           // if 
        if(idx != -1 ) {
            // get the idxth char of shifted alpabet
            char newChar = shiftedAlphabet.charAt(idx);
            //replace the ith character of encrypted
            if(lower){ newChar = Character.toLowerCase(newChar); }
            encrypted.setCharAt(i,newChar);
        }
        
    }
        return encrypted.toString();
    }

    
    
    public void testCaeser() {
        int key = 17;
       // FileResource fr = new FileResource();
       // String message = fr.asString();
       // message = message.toUpperCase();
        System.out.println(encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15));
       // String encrypted = encrypt(message, key);
        //System.out.println("key is " + key + "\n" + encrypted);
        //System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
    }
}
