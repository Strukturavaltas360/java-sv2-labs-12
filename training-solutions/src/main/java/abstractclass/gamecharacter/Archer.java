package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{
    private int numberOfArrow;

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(5)+1;
    }

    private void shootingAnArrow(Character enemy) {
        this.numberOfArrow --;
        super.hit(enemy,getActualSecondaryDamage());
    }

    public void secondaryAttack(Character enemy){
        shootingAnArrow(enemy);
    }
}
