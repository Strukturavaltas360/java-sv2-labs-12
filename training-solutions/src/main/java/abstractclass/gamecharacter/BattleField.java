package abstractclass.gamecharacter;

public class BattleField {

    private int round;


    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        attacker.primaryAttack(defender);
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.secondaryAttack(defender);
        }
        return (attacker.isAlive() && defender.isAlive());
    }

    public Character fight(Character one, Character other) {
        while (oneHit(one, other) && oneHit(other, one)) {
            round++;
        }
        return one.isAlive() ? one : other;
    }
}
