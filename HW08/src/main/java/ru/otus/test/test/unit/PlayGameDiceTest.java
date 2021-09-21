package unit;

import ru.otus.game.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PlayGameDiceTest {
    private final PrintStream tempOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream stream = new PrintStream(outputStream);

    public void testDiceInGame() {
        String scenario = "Тест игры. Бросок дайса";
        try {
            System.setOut(stream);
            GameWinnerPrinter gameWinnerPrinter = new GameWinnerConsolePrinter();
            Dice dice = () -> 1;
            Game game = new Game(dice, gameWinnerPrinter);
            game.playGame(new Player("Вася"), new Player("Петя"));
            String received = outputStream.toString();
            System.setOut(tempOut);
            if (received.equals("Ничья")) {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new RuntimeException("Expected: Ничья Received: " + received);
            }
        } catch (RuntimeException e) {
            System.setOut(tempOut);
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
