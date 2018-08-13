package entity;

/**
 * Una clase para definir lo que puede ser un personaje
 * dentro del juego de "Super Awesome Game"
 */
public class GameCharacter {

    private String mNickname;
    private CharacterStatus mStatus;
    private CharacterEquipment mEquipment;

    /**
     * Pequeño constructor para inicilizar la clase GameCharacter
     *
     * @param nickname nombre
     * @param status los status del personaje
     * @param equipment el equipo del personaje
     */
    public GameCharacter(String nickname, CharacterStatus status,
                         CharacterEquipment equipment) {
        mNickname = nickname;
        mStatus = status;
        mEquipment = equipment;
    }

    /**
     * Regresa el valor del nickname actual
     *
     * @return
     */
    public String getNickname() {
        return mNickname;
    }

    /**
     * Modifica el valor del nickname
     *
     * @param newNickname nuevo nombre
     */
    public void setNickname(String newNickname) {
        mNickname = newNickname;
    }

    /**
     *
     * @return
     */
    public CharacterStatus getStatus() {
        return mStatus;
    }

    /**
     *
     * @param status
     */
    public void setStatus(CharacterStatus status) {
        mStatus = status;
    }

    /**
     *
     * @return
     */
    public CharacterEquipment getEquipment() {
        return mEquipment;
    }

    /**
     *
     * @param equipment
     */
    public void setEquipment(CharacterEquipment equipment) {
        mEquipment = equipment;
    }
}
