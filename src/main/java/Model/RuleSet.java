package Model;

import Model.Player.Player;

import java.awt.*;

public class RuleSet {

    GameBoard gameBoard;

    public RuleSet(GameBoard gameBoard)
    {
        this.gameBoard = gameBoard;
    }

    public int[] squaresOfSameColor(Color color)
    {
        int[] placements = new int[2];

        int placementsIndex = 0;
        for (int i = 0; i < gameBoard.getSquares().length; i++)
        {
            if(color.toString() == (gameBoard.getSquares()[i].getColor().toString()))
            {
                placements[placementsIndex] = i;
                placementsIndex++;
            }
        }
        return placements;
    }

    public boolean gameOver(Player[] players)
    {
        boolean isGameOver = false;
        for(int i = 0; i < players.length; i++)
        {
            if (players[i].getAccount().getBalance() < 0)
            {
                isGameOver = true;
                break;
            }
        }
        return isGameOver;
    }

    public int determineStarter(Player[] players)
    {
        int index = 0;
        int min = players[index].getAge();

        for (int i = 1; i < players.length; i++){
            if (players[i].getAge() <= min){
                min = players[i].getAge();
                index = i;
            }
        }
        return index;
    }

    public Player determineWinner(Player[] players){
        Player winner = null;
        int max = 0;

        for (int i = 0; i < players.length; i++){
            if (players[i].getAccount().getBalance() > max){
                winner = players[i];
                max = players[i].getAccount().getBalance();
            }
        }
        return winner;
    }

}
