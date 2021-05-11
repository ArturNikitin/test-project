package corpus;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FilesToCommonDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\anya\\Documents\\вкр\\corpus\\dp");
        System.out.println(file.isDirectory());
        List<File> directoryFiles = Arrays.asList(file.listFiles());
        for (File directory :
                directoryFiles) {
            List<File> files = Arrays.asList(directory.listFiles());
            for (File f :
                    files) {
                System.out.println("Processing " + f.getName());

                f.renameTo(new File("C:\\Users\\anya\\Documents\\вкр\\corpus\\dp-all\\" + directory.getName() + "_" + f.getName()));
            }
        }

    }
}
