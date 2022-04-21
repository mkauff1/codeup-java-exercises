package files;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NewFile {
    public static void main(String[] args) {
        Path newPath = myFirstFile();
        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add("Hello");
        tryWriteFile(newPath, linesToWrite);

        //do a null check
//        for (String line: tryReadFile(newPath))
//        try {
//            BufferedWriter newTextFile = new BufferedWriter(new FileWriter("output.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static Path myFirstFile(){
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            return dataFile;
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void tryWriteFile(Path filePath, List<String> linesToWrite){
        try {
            Files.write(filePath, linesToWrite);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

//    public static List<String> tryReadFile(Path filePath) {
//        try{
//            return Files.readAllLines(filePath);
//        }catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return
//    }
}
