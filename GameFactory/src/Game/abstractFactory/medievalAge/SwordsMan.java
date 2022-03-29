package Game.abstractFactory.medievalAge;

import Game.abstractFactory.LandUnit;
import Game.abstractFactory.NavalUnit;

public class SwordsMan implements LandUnit {

    public SwordsMan(Capacity capacity)
    {
        System.out.println("Created SwordsMan");
    }

    @Override
    public void startAttack() {
        System.out.println("Starting SwordsMan Attack");
    }

    @Override
    public void attachNavalUnit(NavalUnit navalNumber) {
        System.out.println("attached "+navalNumber.getNavalId()+" Galley with SwordsMan");
    }

    @Override
    public void stopAttack() {
        System.out.println("Stopping SwordsMan Attack");
    }
}
