public class PositiveNumberHandler extends Handler {
    public void handleRequest(int request) {
        if (request > 0) {
            System.out.println("PositiveNumberHandler обработал запрос. Число положительное: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
