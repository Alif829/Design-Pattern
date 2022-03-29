package Game.abstractFactory;

public interface GameUnitFactory {
    LandUnit createLandUnit(LandUnit.Capacity capacity);
    NavalUnit createNavalUnit(int number);
}
