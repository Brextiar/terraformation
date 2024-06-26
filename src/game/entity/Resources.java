package game.entity;

import game.utils.ColoredConsoleText;

/**
 * Class Resources
 */
public class Resources {
    private int energy;
    private int pressure;
    private int heat;
    private int oxygen;
    private int stableMetal;
    private int nonMetal;
    private int radioactiveMetal;
    private int plants;
    private int insects;
    private int animals;
    private int totalBiomass = 0;

    public Resources() {
        energy = 0;
        pressure = 0;
        heat = 0;
        oxygen = 0;
        stableMetal = 0;
        nonMetal = 0;
        radioactiveMetal = 0;
        plants = 0;
        insects = 0;
        animals = 0;
    }

    /**
     * Constructor
     * @param level decide the starting resources
     */
    public Resources(int level) {
        switch (level) {
            case 1:
                energy = 0;
                pressure = 10000;
                heat = 500;
                oxygen = 2000;
                stableMetal = 1200;
                nonMetal = 1200;
                radioactiveMetal = 200;
                plants = 0;
                insects = 0;
                animals = 0;
                break;
            case 2:
                energy = 0;
                pressure = 5000;
                heat = 300;
                oxygen = 1000;
                stableMetal = 400;
                nonMetal = 400;
                radioactiveMetal = 20;
                plants = 0;
                insects = 0;
                animals = 0;
                break;
            case 3:
                energy = 0;
                pressure = 2000;
                heat = 0;
                oxygen = 500;
                stableMetal = 100;
                nonMetal = 100;
                radioactiveMetal = 0;
                plants = 0;
                insects = 0;
                animals = 0;
                break;
            case 4:
                energy = 0;
                pressure = 1000;
                heat = 0;
                oxygen = 0;
                stableMetal = 20;
                nonMetal = 20;
                radioactiveMetal = 0;
                plants = 0;
                insects = 0;
                animals = 0;
                break;
            case 5:
                energy = 0;
                pressure = 0;
                heat = 0;
                oxygen = 0;
                stableMetal = 4;
                nonMetal = 4;
                radioactiveMetal = 0;
                plants = 0;
                insects = 0;
                animals = 0;
                break;
            default:
                energy = 0;
                pressure = 0;
                heat = 0;
                oxygen = 0;
                stableMetal = 0;
                nonMetal = 0;
                radioactiveMetal = 0;
                plants = 0;
                insects = 0;
                animals = 0;
                break;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getOxygen() {
        return oxygen;
    }

    public void setOxygen(int oxygen) {
        this.oxygen = oxygen;
    }

    public int getStableMetal() {
        return stableMetal;
    }

    public void setStableMetal(int stableMetal) {
        this.stableMetal = stableMetal;
    }

    public int getNonMetal() {
        return nonMetal;
    }

    public void setNonMetal(int nonMetal) {
        this.nonMetal = nonMetal;
    }

    public int getRadioactiveMetal() {
        return radioactiveMetal;
    }

    public void setRadioactiveMetal(int radioactiveMetal) {
        this.radioactiveMetal = radioactiveMetal;
    }

    public int getPlants() {
        return plants;
    }

    public void setPlants(int plants) {
        this.plants = plants;
    }

    public int getInsects() {
        return insects;
    }

    public void setInsects(int insects) {
        this.insects = insects;
    }

    public int getAnimals() {
        return animals;
    }

    public void setAnimals(int animals) {
        this.animals = animals;
    }

    public int getTotalBiomass() {
        return totalBiomass;
    }

    public void setTotalBiomass(int totalBiomass) {
        this.totalBiomass = totalBiomass;
    }

    @Override
    public String toString() {
        return "#############################\n" +
                "########## Energie ##########\n" +
                "#############################\n" +
                "|| " + ColoredConsoleText.YELLOW + "Energie" + ColoredConsoleText.RESET + " = [" + energy + "] ||\n" +
                "#############################\n" +
                "######### Atmosphère ########\n" +
                "#############################\n" +
                "|| " + ColoredConsoleText.GREEN + "Pression" + ColoredConsoleText.RESET + " = [" + pressure +
                "] || " + ColoredConsoleText.RED + "Chaleur" + ColoredConsoleText.RESET + " = [" + heat +
                "] || " + ColoredConsoleText.BLUE + "Oxygène" + ColoredConsoleText.RESET + " = [" + oxygen + "] ||\n" +
                "#############################\n" +
                "######### Biomasses #########\n" +
                "#############################\n" +
                "|| " + ColoredConsoleText.GREEN + "Plantes" + ColoredConsoleText.RESET + " = [" + plants +
                "] || " + ColoredConsoleText.RED + "Insectes" + ColoredConsoleText.RESET + " = [" + insects +
                "] || " + ColoredConsoleText.BLUE + "Animaux" + ColoredConsoleText.RESET + " = [" + animals + "] ||\n" +
                "##############################################\n" +
                "######### Ressources de constructions ########\n" +
                "##############################################\n" +
                "|| " + ColoredConsoleText.YELLOW + "Métaux stables" + ColoredConsoleText.RESET + " = [" + stableMetal +
                "] || " + ColoredConsoleText.CYAN + "Non-métaux" + ColoredConsoleText.RESET + " = [" + nonMetal +
                "] || " + ColoredConsoleText.PURPLE + "Métaux Radioactifs" + ColoredConsoleText.RESET + " = [" + radioactiveMetal +
                "] ||\n";
    }
}
