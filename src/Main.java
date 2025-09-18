//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Старый гоблин из прошлого века
        OldEnemy vintageEnemy = new OldEnemy();

        // Надеваем на него современный костюм
        ModernEnemy modernEnemy = new EnemyAdapter(vintageEnemy);

        // Новая система боя работает со старым монстром!
        CombatSystem combat = new CombatSystem();
        combat.executeCombat(modernEnemy);
    }
}