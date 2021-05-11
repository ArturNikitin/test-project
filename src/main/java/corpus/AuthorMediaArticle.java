package corpus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Создает csv файл с данными сортированными по авторам
 *
 * */
public class AuthorMediaArticle {
    public static void main(String[] args) throws IOException {
//        конечный csv файл с результатами
        File resultFile = new File("E:\\corpus-cvs\\author-media-article.csv");
        if (resultFile.exists()) {
            resultFile.delete();
            resultFile.createNewFile();
        }
//      папка с газетами
        File file = new File("E:\\corpus");

        List<File> newspapers = new ArrayList<>(Arrays.asList(file.listFiles()));
        List<File> authors = new ArrayList<>();

        Map<String, String> authorsAndMedia = new HashMap<>();
        Map<String, Integer> authorsAndArticles = new HashMap<>();

        for (File n:
             newspapers) {
            File[] files = n.listFiles();
            authors.addAll(Arrays.asList(files));
            for (File a :
                    Arrays.asList(files)) {
                authorsAndMedia.put(a.getName(), n.getName());
            }
        }

        authors.forEach( x -> {
            authorsAndArticles.put(x.getName(), x.listFiles().length);
        });

        FileWriter fileWriter = new FileWriter(resultFile, true);
        fileWriter.write("media_name,unique_authors,articles\r\n");
        authors.forEach( x-> {
            try {
                fileWriter.write(authorsAndMedia.get(x.getName()) + "," + x.getName() + "," + authorsAndArticles.get(x.getName()) + "\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        fileWriter.close();
    }
}
