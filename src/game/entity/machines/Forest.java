package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class Forest extends Machine
 */
public class Forest extends Machine {

    private final Character letter = 'L';
    private final String name = "Forêt";
    private static int number = 0;

    /**
     * Constructor
     */
    public Forest() {
        super(31, 30, 10, 0, 0, 920, 0, 0, 970, 0, 0, 0, 0, 0);
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
                && planet.getNonMetal() >= super.getNonMetalCost()
                && planet.getPressure() >= 10000
                && planet.getHeat() >= 400;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Forest forest = (Forest) o;
        return Objects.equals(letter, forest.letter) && Objects.equals(name, forest.name);
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
                "Consommation d'énergie : -" + ColoredConsoleText.RED + getProductEnergy() + ColoredConsoleText.RESET + "\n" +
                "Production dressources : Oxygène : +" + ColoredConsoleText.GREEN + getProductOxygen() + ColoredConsoleText.RESET +
                ", Plantes : +" + ColoredConsoleText.GREEN + getProductPlants() + ColoredConsoleText.RESET + "\n" +
                "Condition de construction : " + ColoredConsoleText.BLUE + "Pression >= 10000, Temperature > 400" + ColoredConsoleText.RESET + "\n";
    }
}
