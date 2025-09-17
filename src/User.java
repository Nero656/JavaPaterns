public class User {
    private String nickname;
    private int level;
    private String rank;
    private int health;
    private int mana;
    private boolean isPremium;

    public void setNickname(String nickname) { this.nickname = nickname; }
    public void setLevel(int level) { this.level = level; }
    public void setRank(String rank) { this.rank = rank; }
    public void setHealth(int health) { this.health = health; }
    public void setMana(int mana) { this.mana = mana; }
    public void setPremium(boolean premium) { this.isPremium = premium; }


    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", level=" + level +
                ", rank='" + rank + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", isPremium=" + isPremium +
                '}';
    }
}
