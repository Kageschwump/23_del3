package Controller;

import Model.Player.Player;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class GuiHandler
{
    private GUI gui;

    public GuiHandler(GUI_Field[] guiFields)
    {
        this.gui = new GUI(guiFields, Color.LIGHT_GRAY);
    }

    public void guiAddPlayer(GUI_Player player)
    {
        gui.addPlayer(player);
    }

    public GUI_Car guiCreateCar()
    {
        String primaryColorString;
        Color primaryColor;
        String typeString;
        GUI_Car.Type type;

        primaryColorString = gui.getUserSelection("What color car?", "Black","Blue","Red","Gray","Green","Yellow");
        switch (primaryColorString)
        {
            case ("Black"):
                primaryColor = Color.BLACK;
                break;
            case("Blue"):
                primaryColor = Color.BLUE;
                break;
            case("Red"):
                primaryColor = Color.RED;
                break;
            case("Gray"):
                primaryColor = Color.GRAY;
                break;
            case("Green"):
                primaryColor = Color.GREEN;
                break;
            case("Yellow"):
                primaryColor = Color.YELLOW;
                break;


            default: primaryColor = Color.BLACK;;
        }

        typeString = gui.getUserSelection("What type of car?", "Car","Tractor","Racecar","UFO");
        switch(typeString){
            case("Car"):
                type = GUI_Car.Type.CAR;
                break;
            case("Tractor"):
                type = GUI_Car.Type.TRACTOR;
                break;
            case("Racecar"):
                type = GUI_Car.Type.RACECAR;
                break;
            case("UFO"):
                type = GUI_Car.Type.UFO;
                break;

            default: type = GUI_Car.Type.CAR;
        }

        GUI_Car gui_car = new GUI_Car(primaryColor,Color.BLACK,type, GUI_Car.Pattern.FILL);
        return gui_car;
    }

    public int playerCount()
    {
        return gui.getUserInteger("How many players?",2,4);
    }

    public String playerString(String msg)
    {
        return gui.getUserString(msg);
    }

    public int playerInt(String msg)
    {
        return gui.getUserInteger(msg);
    }

    public void playerRoll(){
    gui.getUserButtonPressed("Time to roll!", "Roll");
    }

    public void printMessage(String message){
        gui.showMessage(message);
    }

    public void getRoll(int faceValue){
        gui.setDie(faceValue);
    }
}
