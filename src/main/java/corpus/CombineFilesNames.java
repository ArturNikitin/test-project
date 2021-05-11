package corpus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CombineFilesNames {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\anya\\Documents\\вкр\\corpus\\dp");
        System.out.println(file.isDirectory());
        List<File> directoryFiles = Arrays.asList(file.listFiles());

        File resultFile = new File("C:\\Users\\anya\\Documents\\вкр\\corpus\\dp-result.txt");
        if (resultFile.exists()) {
            resultFile.delete();
            resultFile.createNewFile();
        }
        FileWriter writer = new FileWriter(resultFile, true);

        //writer.write("author, id\r\n");
        for (File directory :
                directoryFiles) {
            List<File> files = Arrays.asList(directory.listFiles());
            writer.write(directory.getName() + ":");
            for (File f :
                    files) {
                String fileName = f.getName().replace(".txt", "");
                writer.write(fileName + ",");
            }
            writer.write("\r\n");
        }

        writer.close();
    }
}
