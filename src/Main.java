//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OldEnemy vintageEnemy = new OldEnemy();

        ModernEnemy modernEnemy = new EnemyAdapter(vintageEnemy);

        CombatSystem combat = new CombatSystem();
        combat.executeCombat(modernEnemy);
    }
}