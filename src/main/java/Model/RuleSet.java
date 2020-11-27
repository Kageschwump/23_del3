package Model;

import Controller.ChanceCardHandler;
import Model.Player.Player;

import java.awt.*;

public class RuleSet {

    GameBoard gameBoard;
    ChanceCardHandler chanceCardHandler;

    public RuleSet(GameBoard gameBoard, ChanceCardHandler chanceCardHandler)
    {
        this.chanceCardHandler = chanceCardHandler;
        this.gameBoard = gameBoard;
    }

    public boolean checkForPropertyPair(Player player, Color color)
    {
        int[] pair;
        pair = squaresOfSameColor(color);
        if(gameBoard.getSquares()[pair[0]].getOwner().getId() == gameBoard.getSquares()[pair[1]].getOwner().getId())
        {
            return true;
        }
        return false;
    }

    public int[] squaresOfSameColor(Color color)
    {
        int[] placements = new int[2];

        int placementsIndex = 0;
        for (int i = 0; i < gameBoard.getSquares().length; i++)
        {
            if(color.equals(gameBoard.getSquares()[i].getColor()))
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

    public ChanceCardHandler getChanceCardHandler() {
        return chanceCardHandler;
    }

}
