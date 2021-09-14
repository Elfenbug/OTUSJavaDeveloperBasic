package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputClass {
    public static int readLine() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.read();
        }
    }
}
