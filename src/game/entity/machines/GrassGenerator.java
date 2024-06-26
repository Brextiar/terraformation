package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class GrassGenerator extends Machine
 */
public class GrassGenerator extends Machine {

    private final Character letter = 'B';
    private final String name = "Grass generator";
    private static int number = 0;

    public GrassGenerator() {
        super(14, 35, 5, 0, 0, 108, 0, 0, 2, 0, 0, 0, 0, 0);
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
        GrassGenerator that = (GrassGenerator) o;
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
                "Production de plantes : +" + ColoredConsoleText.GREEN + getProductPlants() + ColoredConsoleText.RESET + "\n" +
                "Condition de construction : " + ColoredConsoleText.BLUE + "Pression >= 10000, Temperature > 400" + ColoredConsoleText.RESET + "\n";
    }
}
