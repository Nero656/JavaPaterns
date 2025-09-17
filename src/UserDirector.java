public record UserDirector() {

    private static UserBuilder builder;

    public User createDefaultUser(String nickname) {
        builder = new GameUserBuilder();
        builder.setNickname(nickname);
        builder.setLevel(1);
        builder.setRank("Bronze");
        builder.setHealth(100);
        builder.setMana(50);
        builder.setPremium(false);
        return builder.build();
    }

    public User createPremiumWarrior(String nickname) {
        builder = new GameUserBuilder();
        builder.setNickname(nickname);
        builder.setLevel(20);
        builder.setRank("Gold");
        builder.setHealth(300);
        builder.setMana(150);
        builder.setPremium(true);
        return builder.build();
    }
}
