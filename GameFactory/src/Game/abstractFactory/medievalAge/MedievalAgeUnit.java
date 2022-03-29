package Game.abstractFactory.medievalAge;

import Game.abstractFactory.GameUnitFactory;
import Game.abstractFactory.LandUnit;
import Game.abstractFactory.NavalUnit;


public class MedievalAgeUnit implements GameUnitFactory {
    @Override
    public LandUnit createLandUnit(LandUnit.Capacity capacity) {
        return new SwordsMan(capacity);
    }

    @Override
    public NavalUnit createNavalUnit(int number) {
        return new Galley(50);
    }
}
