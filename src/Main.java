import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Handler negativeNumberHandler = new NegativeNumberHandler();
        Handler zeroNumberHandler = new ZeroNumberHandler();
        Handler positiveNumberHandler = new PositiveNumberHandler();

        negativeNumberHandler.setNext(zeroNumberHandler);
        zeroNumberHandler.setNext(positiveNumberHandler);

        int[] requests = {-24, 231, 31, 224, -328, 13, 0, -220};

        Arrays.stream(requests).forEach(negativeNumberHandler::handleRequest);
    }
}