package Model;

import Model.Player.Player;

import java.awt.*;

public class RuleSet {

    GameBoard gameBoard;

    public RuleSet(GameBoard gameBoard)
    {
        this.gameBoard = gameBoard;
    }

    public boolean checkForPropertyPair(Player player)
    {
        boolean flag = false;

        for(int i = 0; i <= player.getProperties().length; i++)
        {
            for (int q = i + 1; q <= player.getProperties().length; q++)
            {
                if(player.getProperties()[i].getColor() == player.getProperties()[q].getColor())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int[] moveToColor(Color color)
    {
        int[] placements = new int[4];
        int placementsIndex = 0;
        for (int i = 0; i < gameBoard.getSquares().length; i++)
        {
            if(color == gameBoard.getSquares()[i].getColor())
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

    public Player determinewinner(Player[] players){

        Player winner;


        for (int i = 0; i < players.length; i++){
            if (players[i].getAccount().getBalance() > players[i+1].getAccount().getBalance()){
                winner = players[i];
            }
        }


    }

}
