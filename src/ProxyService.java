public class ProxyService implements ImportantService{
    private RealService realService;
    private String password;

    public ProxyService(String password) {
        this.password = password;
    }


    @Override
    public void doImportantWork() {
        if (realService == null) {
            realService = new RealService(); // Создаём только когда нужно
        }

        if ("secret".equals(password)) {
            realService.doImportantWork();
        } else {
            System.out.println("Доступ запрещён. Неверный пароль.");
        }
    }
}
