public class NegativeNumberHandler extends Handler {
    public void handleRequest(int request) {
        if (request < 0) {
            System.out.println("NegativeNumberHandler обработал запрос. Число отрицательное: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
