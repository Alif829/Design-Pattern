package Game.abstractFactory.industrialAge;

import Game.abstractFactory.NavalUnit;

import java.util.Random;

public class IronClad implements NavalUnit {

    public IronClad(int number)
    {
        System.out.println("Created "+number+" IronClad Units");
    }

    Random random=new Random();
    @Override
    public String getNavalId() {
        return String.valueOf(random.nextInt(50));
    }
}
