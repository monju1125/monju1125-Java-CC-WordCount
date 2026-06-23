
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int size = in.length();
        char a = ' ';
        int countWords = 0;
        for(int i =0; i<size-1; i++){
            if (in.charAt(i) == a) {
                countWords+=1;
            }
        }
        return countWords;
    }
}
