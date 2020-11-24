package Model;

import Model.SquareTypes.ChanceCardSquare;
import Model.SquareTypes.Property;
import Model.SquareTypes.StartSquare;
import java.awt.*;

public class GameBoard {


    private GameSquare[] squares;

    public GameBoard()
    {
        squares = new GameSquare[24];
    }

    public void createGameBoard()
    {
        squares[0] = new StartSquare();
        squares[1] = new Property("Burger Bar",1,"Welcome to BURGERZ!",Color.YELLOW, Color.lightGray);
        squares[2] = new Property("Pizza Hut",1,"Welcome to PizzaHut, DO NOT SUE US!",Color.YELLOW, Color.lightGray);
        squares[3] = new ChanceCardSquare();
        squares[4] = new Property("Candy Store",1,"Take me to the Candy shop",Color.lightGray, Color.lightGray);
        squares[5] = new StartSquare();
        squares[6] = new StartSquare();
        squares[7] = new StartSquare();
        squares[8] = new StartSquare();
        squares[9] = new StartSquare();
        squares[10] = new StartSquare();
        squares[11] = new StartSquare();
        squares[12] = new StartSquare();
        squares[13] = new StartSquare();
        squares[14] = new StartSquare();
        squares[15] = new StartSquare();
        squares[16] = new StartSquare();
        squares[17] = new StartSquare();
        squares[18] = new StartSquare();
        squares[19] = new StartSquare();
        squares[20] = new StartSquare();
        squares[21] = new StartSquare();
        squares[22] = new StartSquare();
        squares[23] = new StartSquare();

    }

    public String squareDescription(String name, int placement){
        return null;

    }

}
