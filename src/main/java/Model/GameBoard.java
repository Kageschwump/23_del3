package Model;

import Controller.ChanceCardHandler;
import Model.SquareTypes.*;
import gui_fields.GUI_Field;

import java.awt.*;

public class GameBoard {

    private GUI_Field[] fields = new GUI_Field[24];
    private GameSquare[] squares = new GameSquare[24];
    private ChanceCardHandler chanceCardHandler;

    public GameBoard(ChanceCardHandler chanceCardHandler)
    {
        this.chanceCardHandler = chanceCardHandler;
    }

    public GUI_Field[] createFields()
    {
        for (int i = 0; i < fields.length; i++)
        {
            fields[i] = squares[i].getGuiField();
        }

        return fields;
    }

    public void createGameBoard()
    {
        squares[0] = new StartSquare();
        squares[1] = new Property("Burger Baren",1,"Velkommen til Burger Baren",Color.YELLOW, Color.black);
        squares[2] = new Property("Pizzahuset",1,"Velkommen til Pizzahuset",Color.YELLOW, Color.black);
        squares[3] = new ChanceCardSquare(chanceCardHandler);
        squares[4] = new Property("Slik Butikken",1,"Take me to the Candy shop",Color.lightGray, Color.black);
        squares[5] = new Property("Is Kiosken", 1,"Jeg vil have en gammeldags med 3 kugler",Color.lightGray, Color.black);
        squares[6] = new VisitJailSquare();
        squares[7] = new Property("Museet",2, "Lad os se noget kultur",Color.magenta,Color.black);
        squares[8] = new Property("Bibliotek",2,"Viden er sundt, året rundt", Color.magenta,Color.black);
        squares[9] = new ChanceCardSquare(chanceCardHandler);
        squares[10] = new Property("Skater Parken",2,"Kun for de seje",Color.cyan,Color.black);
        squares[11] = new Property("Svømmehallen",2, "Lad os tage en dukkert", Color.cyan,Color.black);
        squares[12] = new ParkingSquare();
        squares[13] = new Property("Spillehallen",3,"Lad os smide 3000 på rød",Color.PINK,Color.black);
        squares[14] = new Property("Biografen",3,"Lad os se en film",Color.PINK,Color.black);
        squares[15] = new ChanceCardSquare(chanceCardHandler);
        squares[16] = new Property("Legetøjsbutikken",3,"Kun for børn",Color.RED,Color.black);
        squares[17] = new Property("Dyrehandlen", 3,"Jeg vil have en hund",Color.RED,Color.black);
        squares[18] = new PrisonSquare();
        squares[19] = new Property("Bowlinghallen",4,"Det er bowling tid",Color.GREEN,Color.black);
        squares[20] = new Property("Zoologisk Have",4,"Heste, grise, køer og får",Color.GREEN,Color.black);
        squares[21] = new ChanceCardSquare(chanceCardHandler);
        squares[22] = new Property("Vandlandet",5,"Wuuuuuuhuuuuuu",Color.BLUE,Color.black);
        squares[23] = new Property("Strandpromenaden",5,"Waves for days",Color.BLUE,Color.black);

    }

    public GameSquare[] getSquares() {
        return squares;
    }

    public GUI_Field[] getFields() {
        return fields;
    }

    public ChanceCardHandler getChanceCardHandler()
    {
        return chanceCardHandler;
    }
}
