//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserDirector director = new UserDirector();

        User newbie = director.createDefaultUser("NoobMaster");
        User warrior = director.createPremiumWarrior("DragonSlayer");

        System.out.println(newbie);
        System.out.println(warrior);
    }
}