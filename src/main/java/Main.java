import FileReader.FileUtility;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtility fu = new FileUtility();

        String[] file = fu.toStringArray("src\\main\\resources\\test.txt", "[^a-zA-Z0-9]");

    }
}
