//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImportantService service = new ProxyService("wrong_password");
        service.doImportantWork(); // Доступ запрещён

        ImportantService goodService = new ProxyService("secret");
        goodService.doImportantWork(); // Выполняю очень сложную работу...
    }
}