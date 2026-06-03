/**
 * FileProcessor is responsible for creating and managing
 * threads that process multiple files simultaneously.
 */
public class FileProcessor {
    /**
     * Creates threads, starts file processing,
     * and waits for all threads to complete.
     */
    public void processFiles() {
        // Create a thread for processing the first file
        Thread file1 =
                new Thread(
                        new FileProcessingTask(
                                "input1.txt",
                                "output1.txt"
                        ),
                        "Thread-1"
                );
        // Create a thread for processing the second file
        Thread file2 =
                new Thread(
                        new FileProcessingTask(
                                "input2.txt",
                                "output2.txt"
                        ),
                        "Thread-2"
                );
        // Start both threads
        file1.start();
        file2.start();
        try {
            // Wait for both threads to finish
            file1.join();
            file2.join();
        } catch (InterruptedException e) {

            // Restore interrupted status
            Thread.currentThread().interrupt();
        }
        // Display completion message
        System.out.println(
                "All files processed successfully."
        );
    }
}