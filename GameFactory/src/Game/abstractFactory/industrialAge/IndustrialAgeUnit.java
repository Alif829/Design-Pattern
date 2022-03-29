package Game.abstractFactory.industrialAge;

import Game.abstractFactory.GameUnitFactory;
import Game.abstractFactory.LandUnit;
import Game.abstractFactory.NavalUnit;

public class IndustrialAgeUnit implements GameUnitFactory {
    @Override
    public LandUnit createLandUnit(LandUnit.Capacity capacity) {
        return new RiffleMan(capacity);
    }

    @Override
    public NavalUnit createNavalUnit(int number) {
        return new IronClad(50);
    }
}
