package corpus;

import java.io.File;
import java.io.IOException;

public class Testic {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\one1.txt");
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        }
    }
}
