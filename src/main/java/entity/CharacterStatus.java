package entity;

/**
 * Esta clase es para saber cuales son los status del
 * personaje.
 */
public class CharacterStatus {
    private int mHitPoints;
    private int mStrength;
    private int mDefense;
    private int mStamina;
    private int mExperience;

    /**
     *
     *
     * @param hitPoints
     * @param strength
     * @param defense
     * @param stamina
     * @param experience
     */
    public CharacterStatus(int hitPoints, int strength, int defense, int stamina, int experience) {
        mHitPoints = hitPoints;
        mStrength = strength;
        mDefense = defense;
        mStamina = stamina;
        mExperience = experience;
    }

    public int getHitPoints() {
        return mHitPoints;
    }

    public void setHitPoints(int hitPoints) {
        mHitPoints = hitPoints;
    }

    public int getStrength() {
        return mStrength;
    }

    public void setStrength(int strength) {
        mStrength = strength;
    }

    public int getDefense() {
        return mDefense;
    }

    public void setDefense(int defense) {
        mDefense = defense;
    }

    public int getStamina() {
        return mStamina;
    }

    public void setStamina(int stamina) {
        mStamina = stamina;
    }

    public int getExperience() {
        return mExperience;
    }

    public void setExperience(int experience) {
        mExperience = experience;
    }
}
