package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLoggingSLF4J {

    private static final Logger logger = LoggerFactory.getLogger(TestLoggingSLF4J.class);

    public int divide(int a, int b) {
        logger.info("Entering divide method with parameters: a={}, b={}", a, b);
        try {
            int result = a / b;
            logger.info("Exiting divide method with result: {}", result);
            return result;
        } catch (ArithmeticException e) {
            logger.error("Error in divide method: {}", e.getMessage(), e);
            throw e;
        }
    }

    public void readFile(String fileName) throws java.io.IOException {
        logger.info("Entering readFile method with parameter: fileName={}", fileName);
        try {
            java.nio.file.Files.readAllLines(java.nio.file.Paths.get(fileName));
            logger.info("Exiting readFile method after reading file: {}", fileName);
        } catch (IOException e) {
            logger.error("Error in readFile method: {}", e.getMessage(), e);
            throw e;
        }
    }

    public int parseData(String data) {
        logger.info("Entering parseData method with parameter: data={}", data);
        try {
            int result = Integer.parseInt(data);
            logger.info("Exiting parseData method with result: {}", result);
            return result;
        } catch (NumberFormatException e) {
            logger.error("Error in parseData method: {}", e.getMessage(), e);
            throw e;
        }
    }
}
