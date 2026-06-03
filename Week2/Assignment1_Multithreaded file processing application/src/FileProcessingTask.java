import java.io.*;
/**
 * FileProcessingTask processes a single file in a separate thread.
 * It reads data from an input file, converts it to uppercase,
 * writes the result to an output file, and logs the outcome.
 */
public class FileProcessingTask implements Runnable {
    // Input file path
    private final String inputFile;
    // Output file path
    private final String outputFile;
    /**
     * Constructor to initialize input and output files.   *
     * @param inputFile Source file
     * @param outputFile Destination file
     */
    public FileProcessingTask(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }
    /**
     * Executes file processing in a separate thread.
     */
    @Override
    public void run() {

        // Open input and output files
        try (
                BufferedReader reader =
                        new BufferedReader(new FileReader(inputFile));

                BufferedWriter writer =
                        new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            int lineCount = 0;
            // Read file line by line
            while ((line = reader.readLine()) != null) {
                // Convert text to uppercase
                writer.write(line.toUpperCase());
                writer.newLine();
                lineCount++;
            }
            // Log successful processing
            LoggerUtil.log(
                    Thread.currentThread().getName()
                            + " processed "
                            + inputFile
                            + " | Lines: "
                            + lineCount
            );
        } catch (IOException e) {
            // Log processing errors
            LoggerUtil.log(
                    "Error processing "
                            + inputFile
                            + " : "
                            + e.getMessage()
            );
        }
    }
}