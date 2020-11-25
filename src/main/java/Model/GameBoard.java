package Model;

import Model.SquareTypes.*;
import gui_fields.GUI_Field;

import java.awt.*;

public class GameBoard {

    private GUI_Field[] fields = new GUI_Field[24];
    private GameSquare[] squares = new GameSquare[24];

    public GameBoard()
    {
        createGameBoard();
    }

    public GUI_Field[] createFields()
    {
        for (int i = 0; i < fields.length; i++)
        {

            fields[i] = squares[i].getGuiField();
        }

        return fields;
    }

    private void createGameBoard()
    {
        squares[0] = new StartSquare();
        squares[1] = new Property("Burger Bar",1,"Welcome to BURGERZ!",Color.YELLOW, Color.black);
        squares[2] = new Property("Pizza Hut",1,"Welcome to PizzaHut, DO NOT SUE US!",Color.YELLOW, Color.black);
        squares[3] = new ChanceCardSquare();
        squares[4] = new Property("The Candy Store",1,"Take me to the Candy shop",Color.lightGray, Color.black);
        squares[5] = new Property("The Ice Cream Store", 1,"I want an ice cream",Color.lightGray, Color.black);
        squares[6] = new VisitJailSquare();
        squares[7] = new Property("The Museum",2, "Let's go to the Museum",Color.magenta,Color.black);
        squares[8] = new Property("The Library",2,"I want to read some books", Color.magenta,Color.black);
        squares[9] = new ChanceCardSquare();
        squares[10] = new Property("The Skate Park",2,"Cool kids only",Color.ORANGE,Color.black);
        squares[11] = new Property("The Swimming Pool",2, "Let's go swimming", Color.ORANGE,Color.black);
        squares[12] = new ParkingSquare();
        squares[13] = new Property("The Arcade",3,"I'm a gambling addict",Color.PINK,Color.black);
        squares[14] = new Property("The Cinema",3,"Let's watch a movie",Color.PINK,Color.black);
        squares[15] = new ChanceCardSquare();
        squares[16] = new Property("The Toy Store",3,"Kids only",Color.RED,Color.black);
        squares[17] = new Property("The Pet Store", 3,"I want my dog",Color.RED,Color.black);
        squares[18] = new PrisonSquare();
        squares[19] = new Property("Big Bowl",4,"Bowling time",Color.GREEN,Color.black);
        squares[20] = new Property("The Zoo",4,"Exotic animals",Color.GREEN,Color.black);
        squares[21] = new ChanceCardSquare();
        squares[22] = new Property("Water World",5,"Wuuuuuuhuuuuuu",Color.BLUE,Color.black);
        squares[23] = new Property("The Beach",5,"Waves for days",Color.BLUE,Color.black);

    }

    public String squareDescription(String name, int placement){
        return null;

    }

    public GameSquare[] getSquares()
    {
        return squares;
    }

}
