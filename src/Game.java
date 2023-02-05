/*
 * EE422C Project 2 (Mastermind) submission by
 *
 * Jesus Hernandez
 * Jh69848
 * Slip days used: <0>
 * Spring 2023
 */
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
        Boolean gameWon = false;
        while (player.turns < config.guessNumber){
            System.out.println();
            guessLeft = config.guessNumber - player.turns;
            System.out.println("You have " + guessLeft + " guess(es)left.");
            System.out.println("Enter Guess:");
            guess = new String(consol.next());
            Boolean invalid = false;
            Boolean history = false;
            if(guess.equals("HISTORY")){
                history = true;
            }
            else if (guess.length() != config.pegNumber){
                invalid = true;
            }
            else if(true){
                List colors = Arrays.asList(config.colors);
                for (int i = 0; i < guess.length();i++){
                    if(colors.contains(Character.toString(guess.charAt(i))) == false){
                        invalid = true;
                    }

                }

            }
            if (invalid){
                System.out.println("INVALID_GUESS");
            }
            else if (history){
                player.printHistory();
            }
            else{
                pegs = Peg.returnPegs(config.pegNumber, guess, secretCode);
                player.setGuess(guess,pegs);
                player.updateHistory();
                System.out.println(player.getGuess());
                player.turns++;
                if(pegs.equals("4b_0w")){
                    player.turns = config.guessNumber;
                    gameWon = true;
                }
            }

        }
        if(gameWon){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose! The pattern was " + secretCode);
        }
        System.out.println();

    }

}
