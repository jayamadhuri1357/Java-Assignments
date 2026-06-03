import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
/**
 * Utility class for logging file processing results.
 */
public class LoggerUtil {
    // Log file name
    private static final String LOG_FILE = "processing.log";
    /**
     * Writes a message to the log file.
     * The method is synchronized to support
     * safe access by multiple threads.
      * @param message Log message
     */
    public static synchronized void log(String message) {
        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(LOG_FILE, true))) {
            // Write timestamp and log message
            writer.write(
                    LocalDateTime.now()
                            + " - "
                            + message
            );
            writer.newLine();
        } catch (IOException e) {
            // Display logging errors
            System.out.println(
                    "Logging failed: "
                            + e.getMessage()
            );
        }
    }
}