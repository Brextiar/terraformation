package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class FissionReactor extends Machine
 */
public class FissionReactor extends Machine {

    private final Character letter= 'A';
    private final String name = "Réacteur à fission";
    private static int number = 0;

    public FissionReactor() {
        super(0, 80, 60, 30, 1485, 0, 0, 0, 0, 0, 0, 0, 0, 0);
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
                && planet.getRadioactiveMetal() >= super.getRadioactiveMetalCost()
                && planet.getEnergy() >= 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FissionReactor that = (FissionReactor) o;
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
                ", Non-métaux -> " + ColoredConsoleText.RED + getNonMetalCost() + ColoredConsoleText.RESET +
                ", Metal radioactif -> " + ColoredConsoleText.RED + getRadioactiveMetalCost() + ColoredConsoleText.RESET + "\n" +
                "Production d'énergie : +" + ColoredConsoleText.GREEN + getProductEnergy() + ColoredConsoleText.RESET + "\n" +
                "Condition spéciale : " + ColoredConsoleText.PURPLE + "Energie >= 100" + ColoredConsoleText.RESET + "\n";
    }
}
