import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_one;
/**
 *
 * @author Nicholas_White
 */
public class HW_One {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HW_One().run();
    }

    
    void run() {
        /*Exercise 8 - BLUE-WHITE-RED flag 
        Write a program that generates an array of 30 characters that
        is a random sequence of characters 'B', 'W', and 'R'. 
        Once the array is ready the program displays the resulting string, 
        and then sorts the array so that all 'B's come first,
        all 'R's are at the end, and all 'W's are in between. */
        int stringSize = 30;
        Random randomGenerator = new Random();
        String[] BWR = new String[stringSize];
        for (int i=0; i<stringSize; i++){
            int randomInt = randomGenerator.nextInt(3) + 1;
            switch (randomInt){
                case 1: BWR[i] = "B";
                    break;
                case 2: BWR[i] = "W";
                    break;
                case 3: BWR[i] = "R";
                    break;
            }
        }
        for (int i=0;i<stringSize;i++){
            System.out.print(BWR[i] + ' ');
        }
        System.out.println("");
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        
        for (int i=0;i<stringSize;i++){
            switch(BWR[i]){
                case "R": redCount++;
                    break;
                case "W": whiteCount++;
                    break;
                case "B": blueCount++;
            }
        }
        int finalCount = redCount+blueCount+whiteCount;
//        System.out.println(redCount+":R "+blueCount+":B "+whiteCount+":W "+finalCount);
        String[] Final = new String[finalCount];
        for (int i=0;i<blueCount;i++){
            Final[i] = "B";
        }
        for (int i=0;i<whiteCount;i++){
            Final[i+blueCount] = "W";
        }
        for (int i=0;i<redCount;i++){
            Final[i+whiteCount+blueCount] = "R";
        }
        for (int i=0;i<stringSize;i++){
            System.out.print(Final[i] + ' ');
        }
        System.out.println("");
    }
}