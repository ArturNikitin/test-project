package corpus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Создает csv файл с данными сортированными по газетам
 *
 * */
public class MediaAuthorArticles {
    public static void main(String[] args) throws IOException {

//      конечный csv файл с результатами
        File resultFile = new File("E:\\corpus-cvs\\media-author-article.csv");
        if (resultFile.exists()) {
            resultFile.delete();
            resultFile.createNewFile();
        }

//      папка с газетами
        File file = new File("E:\\corpus");

        List<File> newspapers = new ArrayList<>(Arrays.asList(file.listFiles()));
        Map<String, Integer> authors = new HashMap<>();
        Map<String, Integer> articles = new HashMap<>();

        newspapers.forEach(x -> {
            authors.put(x.getName(), x.listFiles().length);
        });

        newspapers.forEach(x -> {
            int sumArticles = 0;
            for (File f :
                    x.listFiles()) {
                sumArticles += f.listFiles().length;
            }
            articles.put(x.getName(), sumArticles);
        });


        FileWriter fileWriter = new FileWriter(resultFile, true);
        fileWriter.write("media_name,unique_authors,articles\r\n");
        newspapers.forEach(x -> {
            try {
                fileWriter.write(x.getName() + "," + authors.get(x.getName()) + "," + articles.get(x.getName()) + "\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        fileWriter.close();
    }
}
