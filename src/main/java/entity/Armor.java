package entity;

public class Armor {
    private int mDefense;
    private String mName;
    private String mDescription;

    public Armor(int defense, String name, String description) {
        mDefense = defense;
        mName = name;
        mDescription = description;
    }

    public int getmDefense() {
        return mDefense;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }
}
