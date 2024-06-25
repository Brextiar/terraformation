import game.entity.Ressources;
import game.mechanics.Game;

public class Main {
    public static void main(String[] args) {
        int level = 6;
        level = Game.choiceLevel(level);
        if (level == 0) {
            System.out.println("Bye!");
            System.exit(0);
        }
        Ressources planet = new Ressources(level);
        System.out.println(planet);
        System.out.println("Bye!");
    }
}