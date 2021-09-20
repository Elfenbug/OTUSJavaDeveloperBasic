package unit;

import ru.otus.game.GameWinnerConsolePrinter;
import ru.otus.game.Player;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameWinnerConsolePrinterTest {
    private final GameWinnerConsolePrinter gameWinnerConsolePrinter = new GameWinnerConsolePrinter();
    private final PrintStream tempOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream stream = new PrintStream(outputStream);

    public void testGameWinnerPrinter() {
        String scenario = "Тест вывода имени победителя";
        try {
            System.setOut(stream);
            String expected = "Вася";
            gameWinnerConsolePrinter.printWinner(new Player(expected));
            String received = outputStream.toString();
            System.setOut(tempOut);
            if (received.equals("Победитель: Вася\r\n")) {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new RuntimeException("Error. Ожидалось '" + expected + "'; Получено: '" + received + "'");
            }
        } catch (RuntimeException e) {
            System.setOut(tempOut);
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
