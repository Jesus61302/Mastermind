/*
 * EE422C Project 2 (Mastermind) submission by
 *
 * Jesus Hernandez
 * Jh69848
 * Slip days used: <0>
 * Spring 2023
 */
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Boolean isTesting = false;
        String [] colors = {"R","Y","B","G","P","O"};
        GameConfiguration config = new GameConfiguration(12, colors , 4);
        SecretCodeGenerator generator = new SecretCodeGenerator(config);
        start(isTesting,config,generator);
    }

    public static void start(Boolean isTesting, GameConfiguration config, SecretCodeGenerator generator) {
        Scanner console = new Scanner(System.in);
        Game Mastermind = new Game(isTesting);
        String play = new String("Y");
        System.out.println("Welcome to MasterMind");
        while (play.equals("Y")){
            System.out.println("Do you want to play a new game? (Y/N):");
            play = new String(console.next());
            if (play.equals("N")){
                break;
            }
            String code = new String(generator.getNewSecretCode());
            Mastermind.runGame(code, config);
        }

    }
}
