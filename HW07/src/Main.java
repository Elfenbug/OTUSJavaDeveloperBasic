import util.InputClass;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(GeneratorOfArray.generateArray(new int[InputClass.readLine()])));
    }
}
