package unit;

import ru.otus.game.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PlayGameWinnerConsolePrinterTest {
    private final PrintStream tempOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream stream = new PrintStream(outputStream);

    public void testGameWinnerPrinter() {
        String scenario = "Тест игры. Вывод имени победителя";
        try {
            Dice dice = new DiceImpl();
            GameWinnerPrinter gameWinnerPrinter = winner -> System.out.print(winner.getName());
            System.setOut(stream);
            Game game = new Game(dice, gameWinnerPrinter);
            game.playGame(new Player("Вася"), new Player("Петя"));
            String result = outputStream.toString();
            System.setOut(tempOut);
            if (result.equals("Вася") || result.equals("Петя")) {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new RuntimeException("Не верно определен победитель");
            }
        } catch (RuntimeException e) {
            System.setOut(tempOut);
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
