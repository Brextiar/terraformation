package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class Aquarium extends Machine
 */
public class Aquarium extends Machine {

    private final Character letter = 'P';
    private final String name = "Aquarium";
    private static int number = 0;

    /**
     * Constructor
     */
    public Aquarium() {
        super(75, 30, 60, 20, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0);
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
                && planet.getHeat() >= 500;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aquarium aquarium = (Aquarium) o;
        return Objects.equals(letter, aquarium.letter) && Objects.equals(name, aquarium.name);
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
                ", Métaux Radioactif -> " + ColoredConsoleText.RED + getRadioactiveMetalCost() + ColoredConsoleText.RESET + "\n" +
                "Consommation d'énergie : -" + ColoredConsoleText.RED + getProductEnergy() + ColoredConsoleText.RESET + "\n" +
                "Production de ressources : Animals : +" + ColoredConsoleText.GREEN + getProductAnimals() + ColoredConsoleText.RESET + "\n" +
                "Condition de construction : " + ColoredConsoleText.BLUE + "Chaleur >= 500" + ColoredConsoleText.RESET + "\n";
    }
}
