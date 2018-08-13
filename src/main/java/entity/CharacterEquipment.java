package entity;

/**
 * Created by Kevin Gomez on 8/10/2018.
 * Applaudo Studios
 */

public class CharacterEquipment {
    private Weapon mWeapon;
    private Armor mArmor;

    public CharacterEquipment(Weapon mWeapon, Armor mArmor) {
        this.mWeapon = mWeapon;
        this.mArmor = mArmor;
    }

    public Weapon getmWeapon() {
        return mWeapon;
    }

    public void setmWeapon(Weapon mWeapon) {
        this.mWeapon = mWeapon;
    }

    public Armor getmArmor() {
        return mArmor;
    }

    public void setmArmor(Armor mArmor) {
        this.mArmor = mArmor;
    }
}
