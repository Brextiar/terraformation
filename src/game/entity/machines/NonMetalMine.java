package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class NonMetalMine extends Machine
 */
public class NonMetalMine extends Machine {
    private final Character letter = 'N';
    private final String name = "Mine de Non-métaux";
    private static int number = 0;

    public NonMetalMine() {
        super(34, 90, 60, 0, 0, 0, 150, 175, 0, 0, 0, 0, 100, 0);
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
        NonMetalMine that = (NonMetalMine) o;
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
                "Consommation d'énerige : -" + ColoredConsoleText.RED + getProductEnergy() + ColoredConsoleText.RESET + "\n" +
                "Production de ressources : Pressure : +" + ColoredConsoleText.GREEN + getProductPressure() + ColoredConsoleText.RESET +
                ", Chaleur : +" + ColoredConsoleText.GREEN + getProductHeat() + ColoredConsoleText.RESET +
                ", Non-métaux : +" + ColoredConsoleText.GREEN + getProductNonMetal() + ColoredConsoleText.RESET + "\n";
    }
}
