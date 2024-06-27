package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class AnimalFarm extends Machine
 */
public class AnimalFarm extends Machine {

    private final Character letter = 'S';
    private final String name = "Ferme à animaux";
    private static int number = 0;

    /**
     * Constructor
     */
    public AnimalFarm() {
        super(270, 150, 120, 10, 0, 0, 3400, 3900, 3100, 170, 3490, 0, 0, 0);
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
                && planet.getPressure() >= 10000
                && planet.getHeat() >= 500
                && planet.getOxygen() >= 2000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AnimalFarm that = (AnimalFarm) o;
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
                ", Métaux Radioactif -> " + ColoredConsoleText.RED + getRadioactiveMetalCost() + ColoredConsoleText.RESET + "\n" +
                "Consommation d'énergie : -" + ColoredConsoleText.RED + getProductEnergy() + ColoredConsoleText.RESET + "\n" +
                "Production de ressources : Pression : +" + ColoredConsoleText.GREEN + getProductPressure() + ColoredConsoleText.RESET +
                ", Chaleur : +" + ColoredConsoleText.GREEN + getProductHeat() + ColoredConsoleText.RESET +
                ", Plantes : +" + ColoredConsoleText.GREEN + getProductPlants() + ColoredConsoleText.RESET +
                ", Insectes : +" + ColoredConsoleText.GREEN + getProductInsects() + ColoredConsoleText.RESET +
                ", Animals : +" + ColoredConsoleText.GREEN + getProductAnimals() + ColoredConsoleText.RESET + "\n" +
                "Condition de construction : " + ColoredConsoleText.BLUE + "Pression >= 10000, Chaleur >= 500, Oxygène >= 2000" + ColoredConsoleText.RESET + "\n";
    }
}
