package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class FishFarm extends Machine
 */
public class FishFarm extends Machine {

    private final Character letter = 'Q';
    private final String name = "Elevage de poissons";
    private static int number = 0;

    /**
     * Constructor
     */
    public FishFarm() {
        super(155, 40, 120, 50, 0, 25, 100, 0, 500, 90, 195, 0, 0, 0);
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
        FishFarm fishFarm = (FishFarm) o;
        return Objects.equals(letter, fishFarm.letter) && Objects.equals(name, fishFarm.name);
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
                "Production de ressources : Oxygène : +" + ColoredConsoleText.GREEN + getProductOxygen() + ColoredConsoleText.RESET +
                ", Pression : " + ColoredConsoleText.BLUE + "10000" + ColoredConsoleText.RESET  +
                ", Plantes : +" + ColoredConsoleText.GREEN + getProductPlants() + ColoredConsoleText.RESET +
                ", Insectes : +" + ColoredConsoleText.GREEN + getProductInsects() + ColoredConsoleText.RESET +
                ", Animals : +" + ColoredConsoleText.GREEN + getProductAnimals() + ColoredConsoleText.RESET + "\n" +
                "Condition de construction : " + ColoredConsoleText.BLUE + "Chaleur >= 500" + ColoredConsoleText.RESET + "\n";
    }
}
