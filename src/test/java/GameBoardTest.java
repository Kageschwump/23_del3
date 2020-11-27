import Controller.ChanceCardHandler;
import Model.GameBoard;
import org.junit.Assert;
import org.junit.Test;

public class GameBoardTest {

    @Test
    public void fieldCreationTest() {
        boolean test = false;
        GameBoard gameBoard = new GameBoard(new ChanceCardHandler());
        gameBoard.createGameBoard();
        gameBoard.createFields();

        if(gameBoard.getSquares().length == gameBoard.getFields().length)
        {
            test = true;
        }

        Assert.assertTrue(test);
    }

}

