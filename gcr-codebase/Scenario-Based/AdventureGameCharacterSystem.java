public class AdventureGameCharacterSystem {

    static class GameCharacter {
        protected String characterName;

        GameCharacter(String characterName) {
            this.characterName = characterName;
        }

        void performAttack() {
            System.out.println(characterName + " performs a basic attack.");
        }
    }

    static class Warrior extends GameCharacter {
        Warrior(String characterName) {
            super(characterName);
        }

        @Override
        void performAttack() {
            System.out.println(characterName + " swings a heavy sword strike.");
        }
    }

    static class Mage extends GameCharacter {
        Mage(String characterName) {
            super(characterName);
        }

        @Override
        void performAttack() {
            System.out.println(characterName + " casts a fireball spell.");
        }
    }

    static class Archer extends GameCharacter {
        Archer(String characterName) {
            super(characterName);
        }

        @Override
        void performAttack() {
            System.out.println(characterName + " releases a precise arrow shot.");
        }
    }

    static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("Battle starts!");
        for (GameCharacter character : characters) {
            character.performAttack();

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("Participants summary:");
        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }

    public static void main(String[] args) {
        GameCharacter[] characters = {
            new Warrior("Thorin"),
            new Mage("Elara"),
            new Archer("Lyra"),
            new Warrior("Bjorn"),
            new Mage("Sorin")
        };

        startBattle(characters);
    }
}
