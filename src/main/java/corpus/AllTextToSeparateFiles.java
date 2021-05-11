package corpus;

import java.io.*;

public class AllTextToSeparateFiles {
    private static final String SEPARATOR = "_";

    public static void main(String[] args) {
        File initialDirectory = new File("E:\\Coding\\Diser\\dp-all");
        File resultDirectory = new File("E:\\Coding\\Diser\\result");

        File[] initialFiles = initialDirectory.listFiles();

        for (File file :
                initialFiles) {
            String[] fileNames = file.getName().split(SEPARATOR);

            String directoryName = resultDirectory.getAbsolutePath() + "\\" + fileNames[0];
            new File(directoryName).mkdir();
            boolean b = file.renameTo(new File(directoryName + "\\" + fileNames[1]));
            System.out.println(b);
        }
    }
}
