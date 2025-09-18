public class CombatSystem {
    public void executeCombat(ModernEnemy enemy) {
        System.out.println("Бой с: " + enemy.getType());
        enemy.performAttack();
        enemy.takeDamage(12);
    }
}
