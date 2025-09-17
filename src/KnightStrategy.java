public class KnightStrategy implements ClassAttackStrategy{
    @Override
    public void attack(String playerName, String className)  {
        System.out.println(className + ' ' + className + " Ударяет мечом!");
    }
}
