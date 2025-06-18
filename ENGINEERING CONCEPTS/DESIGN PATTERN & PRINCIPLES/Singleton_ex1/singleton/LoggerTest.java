package singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger loggerOne = Logger.getInstance();
        Logger loggerTwo = Logger.getInstance();

        loggerOne.log("First message from loggerOne.");
        loggerTwo.log("Second message from loggerTwo.");

        if (loggerOne == loggerTwo) {
            System.out.println("Confirmed: Both are the same instance.");
        } else {
            System.out.println("Error: Different logger instances.");
        }
    }
}
