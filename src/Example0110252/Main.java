package Example0110252;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            Path myPath = Paths.get("./src/Example011025/list.ser");
            Path parent = myPath.getParent();
            DirectoryStream<Path> ds = Files.newDirectoryStream(parent);
            for (Path entry: ds) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

    }
}
