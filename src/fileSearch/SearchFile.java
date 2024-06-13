package fileSearch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFile {
    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        searchFile(new File("~/some/path"), fileList);
        for (int i = 0; i < fileList.size(); i++) {
            System.out.println(i + 1 + ". " + fileList.get(i));
        }
    }

    /**
     * Рекурсивный поиск файлов
     *
     * @param rootFile начальный путь
     * @param fileList список найденных файлов
     */
    private static void searchFile(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("поиск в папке: " + rootFile.getAbsolutePath());
            File[] filesInDirectory = rootFile.listFiles();
            if (filesInDirectory != null ) {
                for (File file : filesInDirectory) {
                    if (file.isDirectory()) {
                        searchFile(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".txt")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
