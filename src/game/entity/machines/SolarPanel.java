package game.entity.machines;

import game.entity.Machine;
import game.entity.Ressources;

import java.util.Objects;

public class SolarPanel extends Machine {

    private final String name = "Panneau solaire";
    private static int number = 0;

    public SolarPanel() {
        super(0, 2, 3, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        number += 1;
    }

    public String getName() {
        return name;
    }

    public static int getNumber() {
        return number;
    }

    @Override
    public boolean isBuildable(Ressources planet) {
        return planet.getStableMetal() >= super.getStableMetalCost()
                && planet.getNonMetal() >= super.getNonMetalCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SolarPanel that = (SolarPanel) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "name='" + name + "'\n" +
                "Production d'énerige : " + getProductEnergy() + "\n" +
                "Coûts de construction : Métaux Stable -> " + getStableMetalCost() + ", Non-métaux -> " + getNonMetalCost() + "\n";
    }
}
