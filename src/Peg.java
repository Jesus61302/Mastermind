/*
 * EE422C Project 2 (Mastermind) submission by
 *
 * Jesus Hernandez
 * Jh69848
 * Slip days used: <0>
 * Spring 2023
 */
import java.io.*;
import java.util.*;

public class Peg {
    private String color;

    public Peg(String color){
        this.color = color;
    }
    //gets an array of pegs and returns amount of black and white pegs
    public static String returnPegs(int numPegs, String guess, String secretCode){

        Peg[] pegs = guessToPegs(numPegs, guess, secretCode);
        int white =0;
        int black = 0;
        for(int i = 0 ; i < pegs.length ; i++){
            if (pegs[i].color.equals("b")){
                black++;
            }
            else if(pegs[i].color.equals("w")){
                white++;
            }
        }
        return black + "b_" + white + "w";

    }
    //turns a guess to pegs
    private static Peg[] guessToPegs(int numPegs, String guess, String secretCode){
        Color[] guess1 = Color.toSet(guess);
        Color[] code1 = Color.toSet(secretCode);
        Peg[] pegs = new Peg[numPegs];
        for (int i = 0; i < code1.length ; i++){
            for ( int j = 0; j < guess1.length ; j++){
                if ( code1[i].color == guess1[j].color && guess1[j].paired == false && code1[i].paired == false){
                    if (i == j){
                        pegs[i] = new Peg("b");
                        guess1[j].paired = true;
                        code1[i].paired = true;
                    }
                    else if (code1[j].color == guess1[j].color ){
                        pegs[j] = new Peg("b");
                        guess1[j].paired = true;
                        code1[j].paired = true;
                    }
                    else if (code1[i].color == guess1[i].color){
                        pegs[i] = new Peg("b");
                        guess1[i].paired = true;
                        code1[i].paired = true;
                    }
                    else{
                        pegs[i] = new Peg("w");
                        guess1[j].paired = true;
                        code1[i].paired = true;
                    }
                }
            }
            if (pegs[i] == null){
                pegs[i] = new Peg("na");
            }

        }
        return pegs;
    }
}
