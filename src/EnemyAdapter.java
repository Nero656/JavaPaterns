public class EnemyAdapter implements ModernEnemy{
    private OldEnemy oldEnemy;

    public EnemyAdapter(OldEnemy oldEnemy) {
        this.oldEnemy = oldEnemy;
    }

    @Override
    public void performAttack() {
        // Преобразуем новую атаку в старую
        oldEnemy.attackWithClub();
    }

    @Override
    public void takeDamage(int damage) {
        oldEnemy.receiveDamage(damage);
    }

    @Override
    public String getType() {
        return "Враг (адаптированный)";
    }
}
