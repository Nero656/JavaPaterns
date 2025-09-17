
public class GunFighterStrategy implements ClassAttackStrategy{

    @Override
    public void attack(String playerName, String className) {
        System.out.println(playerName + ' ' + className +  " Стреляет из пистолетов!");
    }
}
