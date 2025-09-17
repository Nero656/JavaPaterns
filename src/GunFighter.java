public class GunFighter extends Hero{
    public GunFighter(String playerName, String playerClass){
        super(new GunFighterStrategy(), playerName, playerClass);
    }
}
