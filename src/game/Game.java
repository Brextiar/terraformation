package game;

import game.entity.Machine;
import game.entity.Ressources;
import game.utils.ColoredConsoleText;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static Game instance;

    private int level = 6;
    private Ressources planet;
    private static final List<Machine> builtMachines = new ArrayList<>();

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public Ressources getPlanet() {
        return planet;
    }

    public static List<Machine> getBuiltMachines() {
        return builtMachines;
    }

    public static void addMachine(Machine machine, Ressources planet) {
        if (machine.isBuildable(planet)) {
            builtMachines.add(machine);
            planet.setEnergy(planet.getEnergy() + machine.getProductEnergy());
        }
    }

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
                this.planet = new Ressources(this.level);
            } catch (NumberFormatException e) {
                System.out.println(ColoredConsoleText.RED + "Invalid level" + ColoredConsoleText.RESET);
            }
        }
    }

    public void exit() {
        System.out.println("Bye!");
        System.exit(0);
    }
}
