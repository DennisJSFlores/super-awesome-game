package entity;

public class Weapon {
    private int mDamage;
    private String mName;
    private String mDescription;

    public Weapon(int damage, String name, String description) {
        mDamage = damage;
        mName = name;
        mDescription = description;
    }

    public int getDamage() {
        return mDamage;
    }

    public String geName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }
}
