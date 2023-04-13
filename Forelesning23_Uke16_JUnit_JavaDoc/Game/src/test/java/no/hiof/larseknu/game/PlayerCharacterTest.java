package no.hiof.larseknu.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {
    private PlayerCharacter playerCharacter;

    @BeforeEach
    public void init() {
        playerCharacter = new PlayerCharacter();
    }

    @Test
    public void shouldHaveDefaultRandomGeneratedName() {
        assertNotEquals("", playerCharacter.getName(), "No name was generated");
    }

    @Test
    public void shouldNotHaveNickName() {
        PlayerCharacter playerCharacter = new PlayerCharacter();

        assertNull(playerCharacter.getNickName());
    }

    @Test
    public void shouldBeNewbie() {
        assertTrue(playerCharacter.isNoob());
    }

    @Test
    public void shouldIncreaseHealthAfterSleeping() {
        int health = 100;

        playerCharacter.setHealth(health);

        playerCharacter.sleep();

        assertTrue(health < playerCharacter.getHealth());
    }

    @RepeatedTest(100)
    public void shouldIncreaseHealthInExpectedRangeAfterSleeping() {
        int startHealth = 100;
        int maxHealth = 200;

        playerCharacter.setHealth(startHealth);
        playerCharacter.sleep();
        int playerHealth = playerCharacter.getHealth();

        assertTrue(startHealth < playerHealth && playerHealth < maxHealth);
    }

    @Test
    public void shouldHaveNoEmptyDefaultWeapons()
    {
        List<String> result = playerCharacter.getWeapons();

        assertFalse(result.isEmpty());
    }

    @Test
    public void shouldHaveADagger() {
        List<String> result = playerCharacter.getWeapons();

        assertTrue(result.contains("Dagger"));
    }

    @Test
    public void shouldNotHaveWandOfMagicMissiles() {
        List<String> result = playerCharacter.getWeapons();

        assertFalse(result.contains("Wand of Magic Missiles"));
    }

    @Test
    public void shouldHaveAllExpectedWeapons() {
        List<String> result = playerCharacter.getWeapons();

        List<String> startingWeapons = new ArrayList<>();

        startingWeapons.add("Dagger");
        startingWeapons.add("Shortsword");
        startingWeapons.add("Javelin");

        assertEquals(startingWeapons, result, "We don't have all weapons");
    }



    @Test
    public void profanityNicknameCastException() {
        assertThrows(ProfanityException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                playerCharacter.setNickName("Penis");
            }
        });
    }

    @Test
    public void referenceEquality() {
        PlayerCharacter player1 = new PlayerCharacter();
        PlayerCharacter player2 = new PlayerCharacter();

        PlayerCharacter player1Clone = player1;

        assertEquals(player1, player1);

        assertEquals(player1, player1Clone);

        assertNotEquals(player1, player2);

    }


}
