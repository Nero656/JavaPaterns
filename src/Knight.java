public class Knight extends Hero{
    public Knight(String playerName, String playerClass) {
        super(new KnightStrategy(), playerName, playerClass);
    }
}
