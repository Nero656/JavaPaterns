public class ZeroNumberHandler extends Handler {
    public void handleRequest(int request) {
        if (request == 0) {
            System.out.println("ZeroNumberHandler handled обработал запрос. Номер равен нулю: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
