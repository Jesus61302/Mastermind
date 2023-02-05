import java.util.*;

public class Game {
    private static Boolean test;
    public Game(Boolean Test){
        this.test = Test;
    }

    public static void runGame(String secretCode, GameConfiguration config, Scanner consol){
        if (test == true){
            System.out.println("Secret code: " + secretCode);
        }
        Player player = new Player(config);
        int guessLeft = config.guessNumber;
        String guess;
        String pegs;
        while (guessLeft > 1){
            System.out.println();
            guessLeft = config.guessNumber - player.turns;
            System.out.println("You have " + guessLeft + " guess(es)left.");
            System.out.println("Enter Guess:");
            guess = new String(consol.next());
            if(guess.equals("HISTORY")){
                player.printHistory();
            }
            else if (guess.length() != config.pegNumber){
                System.out.println("INVALID_GUESS");
            }
            else{
                for (int i = 0; i < guess.length();i++){
                    if(Character.isUpperCase(guess.charAt(i))){
                        System.out.println("INVALID_GUESS");
                        break;
                    }
                }
            }
            pegs = Peg.returnPegs(config.pegNumber, guess, secretCode);
            player.setGuess(guess,pegs);
            player.updateHistory();
            System.out.println(player.getGuess());
            player.turns++;
        }

    }

}
