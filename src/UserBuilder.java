public interface UserBuilder {
    void setNickname(String nickname);
    void setLevel(int level);
    void setRank(String rank);
    void setHealth(int health);
    void setMana(int mana);
    void setPremium(boolean isPremium);

    User build();
}
