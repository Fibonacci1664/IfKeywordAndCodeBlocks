package com.davegreen;

public class Main
{
    public static void main(String[] args)
    {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if (score < 5000 && score > 1000)
//        {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//            System.out.println("This is in a code block");
//        }
//        else if (score < 1000)
//        {
//            System.out.println("Your score was less than 1000");
//        }
//        else
//        {
//            System.out.println("This runs instead");
//        }
//
//        System.out.println("This is not in a code block");

	    if (gameOver == true) // Can also be written as, if (gameOver), will still check if true, see if statement below.
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Challenge

        // This method uses more memory as we are redefining new variables.

        if (gameOver)
        {
            int newScore = score + 9200;
            int newLevelCompleted = levelCompleted + 3;
            int newBonus = bonus * 2;
            int newFinalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your new final score was " + newFinalScore);
        }

        // This method does not use as much memory as we are reusing the original variables.

        if (gameOver)
        {
            score = score + 10000;
            levelCompleted = levelCompleted + 5;
            bonus = bonus * 4;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your newest final score was " + finalScore);
        }
    }
}
