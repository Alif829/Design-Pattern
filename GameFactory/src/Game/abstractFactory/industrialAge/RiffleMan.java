package Game.abstractFactory.industrialAge;

import Game.abstractFactory.LandUnit;
import Game.abstractFactory.NavalUnit;

public class RiffleMan implements LandUnit {

    public RiffleMan(Capacity capacity)
    {
        System.out.println("Created RiffleMan");
    }

    @Override
    public void startAttack() {
        System.out.println("Starting Riffle Attack");
    }

    @Override
    public void attachNavalUnit(NavalUnit navalNumber) {
        System.out.println("attached "+navalNumber.getNavalId()+" IronClad with RiffleMan");
    }

    @Override
    public void stopAttack() {
        System.out.println("Stopping Riffle Attack");
    }
}
