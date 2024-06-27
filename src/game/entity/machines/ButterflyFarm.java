package game.entity.machines;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.Objects;

/**
 * Class ButterflyFarm extends Machine
 */
public class ButterflyFarm extends Machine {

    private final Character letter = 'K';
    private final String name = "Ferme à papillons";
    private static int number = 0;

    /**
     * Constructor
     */
    public ButterflyFarm() {
        super(30, 10, 5, 0, 0, 0, 0, 0, 0, 75, 0, 0, 0, 0);
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
                && planet.getHeat() >= 500
                && planet.getOxygen() >= 2000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ButterflyFarm that = (ButterflyFarm) o;
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
                "Consommation d'énergie : -" + ColoredConsoleText.RED + getProductEnergy() + ColoredConsoleText.RESET + "\n" +
                "Production de ressources : Insectes : +" + ColoredConsoleText.GREEN + getProductInsects() + ColoredConsoleText.RESET + "\n"
                + "Condition de construction : " + ColoredConsoleText.BLUE + "Pression >= 10000, Chaleur >= 500, Oxygène >= 2000" + ColoredConsoleText.RESET + "\n";
    }
}
