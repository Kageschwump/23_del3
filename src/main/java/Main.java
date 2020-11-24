import Controller.GameHandler;
import Controller.GuiHandler;

public class Main
{
    public static void main(String[] args) {
        GameHandler gameHandler = new GameHandler();
        GuiHandler guiHandler = new GuiHandler(gameHandler.getGameBoard().createFields());
    }
}
