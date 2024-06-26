import game.Game;
import game.entity.machines.FissionReactor;
import game.entity.machines.SolarPanel;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        SolarPanel solarPanel = new SolarPanel();
        game.choiceLevel();
        while (game.getPlanet().getTotalBiomass() < 200000) {

        }
    }
}