package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class SeaweedGenerator extends Machine
 */
public class SeaweedGenerator extends Machine {
    private final Character letter = 'H';
    private final String name = "Générateur d'algues";
    private static int number = 0;

    public SeaweedGenerator() {
        super(13, 30, 10, 0, 0, 127, 0, 0, 8, 0, 0, 0, 0, 0);
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
                && planet.getHeat() >= 500;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SeaweedGenerator that = (SeaweedGenerator) o;
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
                "Production d'Oxygène : +" + ColoredConsoleText.GREEN + getProductOxygen() + ColoredConsoleText.RESET + "\n" +
                "Condition de Construction : " + ColoredConsoleText.BLUE + "Chaleur >= 500";
    }
}
