public class Game {
    private static Boolean test;
    public Game(Boolean Test){
        this.test = Test;
    }

    public static void runGame(String secretCode, GameConfiguration config){
        if (test == true){
            System.out.println("Secret code: " + secretCode);
        }
        Player player = new Player(config);
        System.out.println("game ran");
    }

}
