public class Player {

    private String guess;
    private int turns;
    private String[] history ;

    public Player(GameConfiguration config){
        this.history = new String[config.guessNumber];
        this.turns = config.guessNumber;
    }


    public void setGuess(String guess){


    }

}
