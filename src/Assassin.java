public class Assassin extends Hero{
    public Assassin(String playerName, String playerClass){
        super(new AssassinStrategy(), playerName, playerClass);
    }
}
