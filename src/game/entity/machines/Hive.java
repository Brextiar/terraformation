package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class Hive extends Machine
 */
public class Hive extends Machine {
    private final char letter = 'J';
    private final String name = "Ruche";
    private static int number = 0;

    public Hive() {
        super(25, 10, 20, 0, 0, 0, 0, 0, 3500, 15, 0, 0, 0, 0);
        number += 1;
    }

    public char getLetter() {
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
                && planet.getHeat() >= 500
                && planet.getOxygen() >= 2000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hive hive = (Hive) o;
        return letter == hive.letter && Objects.equals(name, hive.name);
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
                "Production de ressources : Plantes : +" + ColoredConsoleText.GREEN + getProductPlants() + ColoredConsoleText.RESET +
                ", Insectes : +" + ColoredConsoleText.GREEN + getProductInsects() + ColoredConsoleText.RESET + "\n"
                + "Condition de construction : " + ColoredConsoleText.BLUE + "Pression >= 10000, Chaleur >= 500, Oxygène >= 2000" + ColoredConsoleText.RESET + "\n";
    }
}
