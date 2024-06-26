package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class MiniRobots extends Machine
 */
public class MiniRobots extends Machine {

    private final Character letter = 'D';
    private final String name = "Robots mini";
    private static int number = 0;

    /**
     * Constructor
     */
    public MiniRobots() {
        super(2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0);
        number += 1;
    }

    public Character getLetter() {
        return letter;
    }

    public String getName() {
        return name;
    }

    public static int getNumber() {
        return number;
    }

    @Override
    public boolean isBuildable(Resources planet) {
        return planet.getStableMetal() >= super.getStableMetalCost()
                && planet.getNonMetal() >= super.getNonMetalCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MiniRobots that = (MiniRobots) o;
        return Objects.equals(letter, that.letter) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), letter, name);
    }

    @Override
    public String toString() {
        return "name='" + name + "'\n" +
                "Coûts de construction : Métaux Stable -> " + ColoredConsoleText.RED + getStableMetalCost() + ColoredConsoleText.RESET +
                ", Non-métaux -> " + ColoredConsoleText.RED + getNonMetalCost() + ColoredConsoleText.RESET + "\n" +
                "Consomation d'énergie : -" + ColoredConsoleText.RED + getEnergyCost() + ColoredConsoleText.RESET + "\n" +
                "Production de ressources : Métaux Stables -> +" + ColoredConsoleText.GREEN + getProductStableMetal() + ColoredConsoleText.RESET +
                ", Non-métaux -> +" + ColoredConsoleText.GREEN + getProductNonMetal() + ColoredConsoleText.RESET + "\n";
    }
}
