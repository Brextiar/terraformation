package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class FrogFarm extends Machine
 */
public class FrogFarm extends Machine {

    private final Character letter = 'R';
    private final String name = "Ferme de grenouilles";
    private static int number = 0;

    /**
     * Constructor
     */
    public FrogFarm() {
        super(155, 50, 150, 30, 0, 0, 750, 1750, 750, 0, 825, 0, 0, 0);
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
        FrogFarm frogFarm = (FrogFarm) o;
        return Objects.equals(letter, frogFarm.letter) && Objects.equals(name, frogFarm.name);
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
                ",  Animals : +" + ColoredConsoleText.GREEN + getProductAnimals() + ColoredConsoleText.RESET + "\n" +
                "Condition de construction : " + ColoredConsoleText.BLUE + "Pression >= 10000, Chaleur >= 500, Oxygène >= 2000" + ColoredConsoleText.RESET + "\n";
    }
}
