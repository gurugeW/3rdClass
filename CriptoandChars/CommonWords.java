
/**
 * Write a description of CommonWords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class CommonWords {

    public String[] getCommon(){
        FileResource resource = new FileResource("data/common.txt");
        String [] common = new String [20];
        int index = 0;
        for(String s : resource.words()){
            common[index] = s;
            index += 1;
            //  System.out.println(s);
        }
        return common;       
    }

    
    public void countShakespeare(){

        //String [] plays = {"caesar.txt", "errors.txt", "hamlet.txt",
        //"likeit.txt", "macbeth.txt", "romeo.txt"};
        String [] plays = {"small.txt"};
        String[] common = getCommon();
        int[] counts = new int[common.length];
        for(int k= 0; k < plays.length; k++){
            FileResource resource = new FileResource("data/" + plays[k]);
            countWords(resource, common,counts);
            System.out.println("==============================================");
            System.out.println(" done with " + plays[k]);
        }

        for(int k =0; k < common.length; k++){
            System.out.println(common[k] + "\t" + counts[k]);
        }
        System.out.println("==============================================");    
    }

    public int indexOf(String[] list, String word) {
        for(int i = 0; i < list.length; i++){ 
            if(list[i].equals(word)){
                return i;

            }
        }
        return -1;

    }

    public void countWords(FileResource resource, String[] common, int[] counts) {
        for(String word : resource.words()) {
            word = word.toLowerCase();
            //System.out.println(word);
            int index = indexOf(common, word);
            if(index != -1) {
                counts[index] += 1;
            }
        }

    }

}
