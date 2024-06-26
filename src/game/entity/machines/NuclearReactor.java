package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;
import java.util.Objects;

/**
 * Class NuclearReactor extends Machine
 */
public class NuclearReactor extends Machine {

    private final Character letter = 'B';
    private final String name = "Réacteur nucleaire";
    private static int number = 0;

    public NuclearReactor() {
        super(0, 10, 8, 0, 86, 0, 0, 0, 0, 0, 0, 0, 0, 0);
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
        NuclearReactor that = (NuclearReactor) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "name='" + name + "'\n" +
                "Coûts de construction : Métaux Stable -> " + ColoredConsoleText.RED + getStableMetalCost() + ColoredConsoleText.RESET +
                ", Non-métaux -> " + ColoredConsoleText.RED + getNonMetalCost() + ColoredConsoleText.RESET + "\n" +
                "Production d'énergie : " + ColoredConsoleText.GREEN + getProductEnergy() + ColoredConsoleText.RESET + "\n";
    }
}
