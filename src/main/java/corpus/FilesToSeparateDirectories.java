package corpus;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FilesToSeparateDirectories {

    public static void main(String[] args) {
        File file = new File("E:\\Coding\\novaya");
        System.out.println(file.isDirectory());
        List<File> directoryFiles = Arrays.asList(file.listFiles());

        for (File directory :
                directoryFiles) {
            List<File> files = Arrays.asList(directory.listFiles());

            File newDirectory = new File("E:\\Coding\\novaya2\\" + directory.getName());

            if (!newDirectory.exists()) {
                newDirectory.mkdir();
            }

            for (File f :
                    files) {
                f.renameTo(new File(newDirectory.getAbsolutePath() + "\\" + directory.getName() + "_" + f.getName()));
            }
        }
    }
}
