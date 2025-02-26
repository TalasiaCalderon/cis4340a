import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class R13_FIO02_J {
    
    Path file = new File(args[0]).toPath();
    try {
        Files.delete(file);
    } catch (IOException x) {
        // Deletion failed, handle error
    }
}
