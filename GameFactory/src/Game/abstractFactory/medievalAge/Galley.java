package Game.abstractFactory.medievalAge;

import Game.abstractFactory.NavalUnit;

import java.util.Random;

public class Galley implements NavalUnit {
    public Galley(int number)
    {
        System.out.println("Created "+number+" Galley Units");
    }

    Random random=new Random();
    @Override
    public String getNavalId() {
        return String.valueOf(random.nextInt(50));
    }
}
