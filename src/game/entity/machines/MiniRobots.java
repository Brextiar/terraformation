package game.entity.machines;

import game.entity.Machine;
import game.entity.Ressources;

public class MiniRobots extends Machine {

    private final String name = "Robots mini";
    private static int number = 0;

    public MiniRobots() {
        super(2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0);
        number += 1;
    }
    @Override
    public boolean isBuildable(Ressources planet) {
        return planet.getStableMetal() >= super.getStableMetalCost()
                && planet.getNonMetal() >= super.getNonMetalCost();
    }
}
