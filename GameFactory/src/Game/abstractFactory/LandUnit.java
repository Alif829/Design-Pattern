package Game.abstractFactory;

public interface LandUnit {
    enum Capacity{micro, small, large}

    void startAttack();

    void attachNavalUnit(NavalUnit navalNumber);

    void stopAttack();
}
