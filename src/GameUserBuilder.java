public class GameUserBuilder implements UserBuilder{
    private User user;

    public GameUserBuilder() {
        this.user = new User();
    }

    @Override
    public void setNickname(String nickname) { user.setNickname(nickname); }

    @Override
    public void setLevel(int level) { user.setLevel(level); }

    @Override
    public void setRank(String rank) { user.setRank(rank); }

    @Override
    public void setHealth(int health) { user.setHealth(health); }

    @Override
    public void setMana(int mana) { user.setMana(mana); }

    @Override
    public void setPremium(boolean isPremium) { user.setPremium(isPremium); }

    @Override
    public User build() { return user; }
}
