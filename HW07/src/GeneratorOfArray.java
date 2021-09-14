import exception.CantCreateArrayException;
import exception.GenerateThrowClass;

public class GeneratorOfArray {
    public static int[] generateArray(int[] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                if (i > 9) {
                    throw new CantCreateArrayException("Не могу создать массив, размерность должна быть <= 10");
                }
            }
        } catch (CantCreateArrayException e) {
            try {
                GenerateThrowClass throwy = new GenerateThrowClass();
                throwy.getThrowException();
            } catch (IllegalAccessException ex) {
                System.out.println(ex.getMessage());
            }
            return array;
        }

        return array;
    }
}
