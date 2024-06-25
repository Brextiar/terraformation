package game.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Machine {

    private int energyCost;
    private int stableMetalCost;
    private int nonMetalCost;
    private int radioactiveMetalCost;
    private int productEnergy;
    private int productOxygen;
    private int productPressure;
    private int productHeat;
    private int productPlants;
    private int productInsects;
    private int productAnimals;
    private int productStableMetal;
    private int productNonMetal;
    private int productRadioactiveMetal;

    public Machine(int energyCost, int stableMetalCost, int nonMetalCost, int radioactiveMetalCost,
                   int productEnergy, int productOxygen, int productPressure, int productHeat,
                   int productPlants, int productInsects, int productAnimals, int productStableMetal,
                   int productNonMetal, int productRadioactiveMetal) {
        this.energyCost = energyCost;
        this.stableMetalCost = stableMetalCost;
        this.nonMetalCost = nonMetalCost;
        this.radioactiveMetalCost = radioactiveMetalCost;
        this.productEnergy = productEnergy;
        this.productOxygen = productOxygen;
        this.productPressure = productPressure;
        this.productHeat = productHeat;
        this.productPlants = productPlants;
        this.productInsects = productInsects;
        this.productAnimals = productAnimals;
        this.productStableMetal = productStableMetal;
        this.productNonMetal = productNonMetal;
        this.productRadioactiveMetal = productRadioactiveMetal;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public int getStableMetalCost() {
        return stableMetalCost;
    }

    public void setStableMetalCost(int stableMetalCost) {
        this.stableMetalCost = stableMetalCost;
    }

    public int getNonMetalCost() {
        return nonMetalCost;
    }

    public void setNonMetalCost(int nonMetalCost) {
        this.nonMetalCost = nonMetalCost;
    }

    public int getRadioactiveMetalCost() {
        return radioactiveMetalCost;
    }

    public void setRadioactiveMetalCost(int radioactiveMetalCost) {
        this.radioactiveMetalCost = radioactiveMetalCost;
    }

    public int getProductEnergy() {
        return productEnergy;
    }

    public void setProductEnergy(int productEnergy) {
        this.productEnergy = productEnergy;
    }

    public int getProductOxygen() {
        return productOxygen;
    }

    public void setProductOxygen(int productOxygen) {
        this.productOxygen = productOxygen;
    }

    public int getProductPressure() {
        return productPressure;
    }

    public void setProductPressure(int productPressure) {
        this.productPressure = productPressure;
    }

    public int getProductHeat() {
        return productHeat;
    }

    public void setProductHeat(int productHeat) {
        this.productHeat = productHeat;
    }

    public int getProductPlants() {
        return productPlants;
    }

    public void setProductPlants(int productPlants) {
        this.productPlants = productPlants;
    }

    public int getProductInsects() {
        return productInsects;
    }

    public void setProductInsects(int productInsects) {
        this.productInsects = productInsects;
    }

    public int getProductAnimals() {
        return productAnimals;
    }

    public void setProductAnimals(int productAnimals) {
        this.productAnimals = productAnimals;
    }

    public int getProductStableMetal() {
        return productStableMetal;
    }

    public void setProductStableMetal(int productStableMetal) {
        this.productStableMetal = productStableMetal;
    }

    public int getProductNonMetal() {
        return productNonMetal;
    }

    public void setProductNonMetal(int productNonMetal) {
        this.productNonMetal = productNonMetal;
    }

    public int getProductRadioactiveMetal() {
        return productRadioactiveMetal;
    }

    public void setProductRadioactiveMetal(int productRadioactiveMetal) {
        this.productRadioactiveMetal = productRadioactiveMetal;
    }

    public void simulate(Ressources planet) {

    }

    public void produce(Ressources planet) {
        planet.setEnergy(planet.getEnergy() + energyCost);
        planet.setOxygen(planet.getOxygen() + productOxygen);
        planet.setPressure(planet.getPressure() + productPressure);
        planet.setHeat(planet.getHeat() + productHeat);
        planet.setPlants(planet.getPlants() + productPlants);
        planet.setInsects(planet.getInsects() + productInsects);
        planet.setAnimals(planet.getAnimals() + productAnimals);
        planet.setStableMetal(planet.getStableMetal() + productStableMetal);
        planet.setNonMetal(planet.getNonMetal() + productNonMetal);
        planet.setRadioactiveMetal(planet.getRadioactiveMetal() + productRadioactiveMetal);
    }
    public abstract boolean isBuildable(Ressources planet);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return energyCost == machine.energyCost && stableMetalCost == machine.stableMetalCost && nonMetalCost == machine.nonMetalCost && radioactiveMetalCost == machine.radioactiveMetalCost && productEnergy == machine.productEnergy && productOxygen == machine.productOxygen && productPressure == machine.productPressure && productHeat == machine.productHeat && productPlants == machine.productPlants && productInsects == machine.productInsects && productAnimals == machine.productAnimals && productStableMetal == machine.productStableMetal && productNonMetal == machine.productNonMetal && productRadioactiveMetal == machine.productRadioactiveMetal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(energyCost, stableMetalCost, nonMetalCost, radioactiveMetalCost, productEnergy, productOxygen, productPressure, productHeat, productPlants, productInsects, productAnimals, productStableMetal, productNonMetal, productRadioactiveMetal);
    }

    @Override
    public String toString() {
        return "Machine{}";
    }

}
