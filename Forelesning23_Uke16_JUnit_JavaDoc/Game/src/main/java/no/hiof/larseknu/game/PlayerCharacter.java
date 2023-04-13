package no.hiof.larseknu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *  PlayerCharacter is a class that represent a playable character in the game.
 * Holds information about the name, nickName, level, noob status, health and current weapons.
 *
 * @author Lars Emil
 * @author Uncle Bob
 *
 */
public class PlayerCharacter {
    private int health, level;
    private String name, nickName;
    private boolean isNoob;

    /**
     * The list of weapons the PlayerCharacter has available
     */
    private List<String> weapons;

    private Random randomGen = new Random();

    /**
     * Sets a default name for the PlayerCharacter, sets isNoob to true, level to 1, health to 30
     * and generates a list of starting weapons.
     */
    public PlayerCharacter() {
        name = generateName();
        isNoob = true;
        level = 1;
        health = 30;
        weapons = createStartingWeapons();
    }

    /**
     * Increases the health of the character within a random range between 1 and 99.
     * Should be called when the PlayerCharacter is sleeping.
     */
    public void sleep() {
        health += randomGen.nextInt(99) + 1;
    }

    /**
     * Decreases the PlayerCharacter health with the set damage, down to a minimum of 0.
     *
     * @param damage the amount of damage the PlayerCharacter takes
     */
    public void takeDamage(int damage) {
        health = Math.max(0, health -= damage);
    }

    /**
     * Generates a name from a set list
     *
     * @return the generated name
     */
    private String generateName() {
        String[] names = new String[] {
                "Saeris",
                "Mal'Ganis",
                "Stradh",
                "Minsk",
                "Thor"
        };

        return names[randomGen.nextInt(names.length)];
    }

    /**
     * Creates the list of weapons the PlayerCharacter should start with when created the first time.
     *
     * @return the list containing the starting weapons
     */
    private List<String> createStartingWeapons() {
        List<String> startingWeapons = new ArrayList<>();

        startingWeapons.add("Dagger");
        startingWeapons.add("Shortsword");
        startingWeapons.add("Javelin");

        //weapons.add("Wand of Magic Missiles");

        return startingWeapons;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the nickName of the PlayerCharacter.
     *
     * @param nickName the nickName to be set
     *
     * @exception ProfanityException if the nickName is a bad word
     */
    public void setNickName(String nickName) throws ProfanityException {
        if (nickName.contains("Penis"))
            throw new ProfanityException(nickName + " contains a bad word that's not allowed");
        else
            this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public boolean isNoob() {
        return isNoob;
    }

    public void setNoob(boolean noob) {
        isNoob = noob;
    }

    public List<String> getWeapons() {
        return weapons;
    }
}
