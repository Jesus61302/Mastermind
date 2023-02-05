import java.util.Arrays;
public class Player {

    private String guess;
    int turns;
    private String[] history ;

    public Player(GameConfiguration config){
        this.history = new String[config.guessNumber];
        this.turns = 0;
    }


    public void setGuess(String guess , String pegs){
        this.guess = guess + " -> " + pegs;

    }
    public String getGuess(){
        return this.guess;
    }

    public void updateHistory(){
        history[turns] = this.guess;
    }
    public void printHistory(){
        Arrays.toString(history);
    }

}
