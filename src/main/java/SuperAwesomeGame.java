import entity.Armor;
import entity.CharacterEquipment;
import entity.CharacterStatus;
import entity.GameCharacter;
import entity.Weapon;

class SuperAwesomeGame {

    public static void main(String[] args) {
        CharacterStatus heroStatus = new CharacterStatus(40, 10, 3, 5 , 2);
        CharacterStatus slimeStatus = new CharacterStatus(10, 5, 0, 5 , 2);

        CharacterEquipment equipment = new CharacterEquipment(new Weapon(15, "Excalibur", "Espada legendaria"),
                new Armor(10, "Armadura de bronce", "Armadura que da una pequeña defensa"));

        GameCharacter mainCharacter = new GameCharacter("Megaman", heroStatus, equipment);
        GameCharacter slimeEnemy = new GameCharacter("Slime", slimeStatus, equipment);

        // Tus HP se disminuyen en la cantidad de la fuerza del atacante menos la defensa del atacado

        // Iniciar batalla
        System.out.println("Inicia batalla contra slime");
        while (mainCharacter.getStatus().getHitPoints() > 0 && slimeEnemy.getStatus().getHitPoints() > 0) {
            mainCharacter.getStatus().setHitPoints(calculateDamage(mainCharacter.getStatus(), slimeEnemy.getStatus()));
            System.out.println("Hero hp: " + mainCharacter.getStatus().getHitPoints()); // deberia de ser menos de 40

            slimeEnemy.getStatus().setHitPoints(calculateDamage(slimeEnemy.getStatus(), mainCharacter.getStatus()));
            System.out.println("Slime hp: " + slimeEnemy.getStatus().getHitPoints()); // deberia de ser menos a 10

            if (mainCharacter.getStatus().getHitPoints() <= 0) {
                System.out.println("Game Over!");
            } else if (slimeEnemy.getStatus().getHitPoints() <= 0) {
                System.out.println("Derrotaste a " + slimeEnemy.getNickname());
            }
        }

        System.out.println("La batalla termino!");
    }

    public static int calculateDamage(CharacterStatus defenderStatus, CharacterStatus attackerStatus) {
        int characterHitPoints = (defenderStatus.getHitPoints() + defenderStatus.getDefense()) - attackerStatus.getStrength();
        return characterHitPoints;
    }
}
