package no.hiof.larseknu.game;

public class Main {
    public static void main(String[] args) throws ProfanityException {
        PlayerCharacter playerCharacter = new PlayerCharacter();

        // Tvinger frem en ProfanityException
        playerCharacter.setNickName("SomethingSomethingPenis");
    }
}