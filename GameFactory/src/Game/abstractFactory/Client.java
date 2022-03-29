package Game.abstractFactory;

import Game.abstractFactory.industrialAge.IndustrialAgeUnit;
import Game.abstractFactory.medievalAge.MedievalAgeUnit;

public class Client {

    private GameUnitFactory gameUnitFactory;

    public Client(GameUnitFactory gameUnitFactory) {
        this.gameUnitFactory = gameUnitFactory;
    }

    public LandUnit createGame(LandUnit.Capacity cap, int number) {
        LandUnit landUnit = gameUnitFactory.createLandUnit(cap);
        NavalUnit navalUnit = gameUnitFactory.createNavalUnit(50);
        landUnit.attachNavalUnit(navalUnit);
        return landUnit;
    }

    public static void main(String[] args) {
        Client industrialUnit = new Client(new IndustrialAgeUnit());
        LandUnit i1 = industrialUnit.createGame(LandUnit.Capacity.micro, 50);
        i1.startAttack();
        i1.stopAttack();

        System.out.println("***************************************");

        Client medievalUnit = new Client(new MedievalAgeUnit());
        LandUnit i2 = medievalUnit.createGame(LandUnit.Capacity.micro, 50);
        i2.startAttack();
        i2.stopAttack();
    }
}
