public class AssassinStrategy implements ClassAttackStrategy {
    @Override
    public void attack(String playerName, String className) {
        System.out.println(playerName + ' ' + className + " Бьет кинжалом!");
    }
}
