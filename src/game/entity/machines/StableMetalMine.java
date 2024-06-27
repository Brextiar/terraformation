package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class StableMetalMine extends Machine
 */
public class StableMetalMine extends Machine {

    private final Character letter = 'M';
    private final String name = "Mine de métaux stable";
    private static int number = 0;

    public StableMetalMine() {
        super(34, 120, 30, 0, 0, 0, 150, 175, 0, 0, 0, 100, 0, 0);
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
        StableMetalMine that = (StableMetalMine) o;
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
                "Production de ressources : Pression : +" + ColoredConsoleText.GREEN + getProductPressure() +
                ", Chaleur : +" + ColoredConsoleText.GREEN + getProductHeat() + ColoredConsoleText.RESET +
                ", Métaux Stable : +" + ColoredConsoleText.GREEN + getProductStableMetal() + ColoredConsoleText.RESET + "\n";
    }
}
