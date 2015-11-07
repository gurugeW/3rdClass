
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {

    public String  emphasize (String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for( int i = 0; i < sb.length(); i++ ) {
            char currChar = sb.charAt(i);
            if(currChar == ch) {
                sb.deleteCharAt(i);
                if( (i % 2)>= 1 ) sb.insert(i,'+');
                else  sb.insert(i,'*');

            }
        }
        return sb.toString();
    }

    public void testEmphasize() {
        System.out.println(emphasize( "Mary Bella Abracadabra", 'a') );            
    }

    public String  replaceVowels(String phrase, char ch){
        StringBuilder vowelLess = new StringBuilder(phrase);
        for(int i = 0; i < vowelLess.length(); i++){ 
            char currChar = vowelLess.charAt(i);
            if( isVowel(vowelLess.charAt(i))) {

                vowelLess.deleteCharAt(i); 
                vowelLess.insert(i,ch);
            }

        }
        return vowelLess.toString() ;  
    }

    public void testReplaceVowel() { 
        System.out.println(replaceVowels("Hellow World", '*'));   

    }

    public boolean isVowel(char ch){
        boolean test = false;
        ch = Character.toLowerCase(ch);
        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ 
            test = true; }

        return test;
    }  

    public void testIsVowel() {
        System.out.println( isVowel('O'));
        System.out.println( isVowel('o'));
        System.out.println( isVowel('F'));
        System.out.println( isVowel('f'));

    }

}
