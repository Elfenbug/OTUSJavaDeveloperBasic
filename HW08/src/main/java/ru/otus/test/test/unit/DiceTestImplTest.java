package unit;

import ru.otus.game.DiceImpl;

public class DiceTestImplTest {
    private final DiceImpl dice = new DiceImpl();

    public void testDiceRoll() {
        String scenario = "Тест дайса";
        try {
            int diceRoll = dice.roll();
            if (diceRoll >= 1 && diceRoll <= 6) {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new Exception("Выпало значение, отличное от значений на дайсе: " + diceRoll);
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
