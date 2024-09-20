public class HangmanGame{
    
    private String answer;
    private StringBuffer guess;
    private StringBuffer letters;
    
    public HangmanGame(String ans){
        answer = ans;
        letters = new StringBuffer();
        String dash = "";
        for (int cnt = 0; cnt < ans.length(); cnt++){
            dash += "-";
        }
        guess = new StringBuffer(dash);
    }
    
    public String getWord(){
        return answer;
    }
    public String getGuessed(){
        return guess.toString();
    }
    public String getTried(){
        return letters.toString();
    }
    
    public int tryLetter(char l){
        String lettersCopy = letters.toString();
        if (answer.indexOf(l) != -1 && lettersCopy.indexOf(l) == -1){
            letters = letters.append(l);
            int index = answer.indexOf(l);
            while (index != -1){
                guess.setCharAt(index, l);
                index = answer.indexOf(l,index + 1);
            }
            return 1;
        } else if (lettersCopy.indexOf(l) != -1){
            return 0;
        } else {
            letters = letters.append(l);
            return -1;
        }
    }
}
