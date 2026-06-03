/**
 * Main class of the application.
 * It serves as the entry point for the multithreaded
 * file processing program.
 */
public class Main {
    /**
     * Starts the file processing application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create a FileProcessor object
        FileProcessor processor =
                new FileProcessor();
        // Start file processing
        processor.processFiles();
    }
}