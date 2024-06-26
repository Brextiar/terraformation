package game;

import game.entity.Machine;
import game.entity.Resources;
import game.utils.ColoredConsoleText;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Game
 */
public class Game {
    private static Game instance;

    private int level = 6;
    private Resources planet;
    private final List<Machine> builtMachines = new ArrayList<>();
    private int totalBiomass = 0;

    /**
     * Constructor
     */
    private Game() {
    }

    /**
     * Singleton
     * @return Game instance
     */
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    /**
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @return planet, the Ressources of the actual game
     */
    public Resources getPlanet() {
        return planet;
    }

    /**
     * @return builtMachines, the list of all built machines
     */
    public List<Machine> getBuiltMachines() {
        return builtMachines;
    }

    /**
     * @param machine the machine to build
     * @param planet the Ressources of the actual game
     */
    public void addMachine(Machine machine, Resources planet) {
        if (machine.isBuildable(planet)) {
            builtMachines.add(machine);
            planet.setEnergy(planet.getEnergy() + machine.getProductEnergy());
        } else {
            System.out.println(ColoredConsoleText.RED + "Impossible de construire cette machine" + ColoredConsoleText.RESET);
        }
    }

    /**
     * Set the level of the game
     */
    public void choiceLevel() {
        Scanner sc = new Scanner(System.in);
        while (this.level > 5 || this.level < 0) {
            System.out.println("Choisissez un niveau (1-5), 0 pour quitter: ");
            String selectedLevel = sc.nextLine();
            try {
                this.level = Integer.parseInt(selectedLevel);
                if (this.level == 0) {
                    this.exit();
                }
                if (this.level > 5 || this.level < 0) {
                    throw new NumberFormatException();
                }
                this.planet = new Resources(this.level);
            } catch (NumberFormatException e) {
                System.out.println(ColoredConsoleText.RED + "Invalid level" + ColoredConsoleText.RESET);
            }
        }
    }

    /**
     * Close the game
     */
    public void exit() {
        System.out.println("Bye!");
        System.exit(0);
    }
}
