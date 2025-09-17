public class Hero {
    String playerName;
    String playerClass;
    ClassAttackStrategy attackStrategy;

    public Hero(ClassAttackStrategy attackStrategy, String playerName, String playerClass) {
        this.playerName = playerName;
        this.playerClass = playerClass;
        this.attackStrategy = attackStrategy;
    }

    public void walkForward() {
        System.out.println(playerName + ' ' + playerClass + " Идет вперед");
    }

    public void walkBack() {
        System.out.println(playerName + ' ' + playerClass + " Идет назад");
    }

    public void attack() {
        attackStrategy.attack(playerName, playerClass);
    }

    public void setAttackStrategy(ClassAttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
