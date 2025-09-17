//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Assassin assassin = new Assassin("Бродяга Джо", "Ассасин");

        assassin.walkForward();

        assassin.attack();

        assassin.walkBack();

        assassin.setAttackStrategy(new GunFighterStrategy());

        assassin.attack();
    }
}