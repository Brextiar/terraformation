package game.mechanics;

import game.utils.ColoredConsoleText;

import java.util.Scanner;

public class Game {
    public static int choiceLevel(int level) {
        Scanner sc = new Scanner(System.in);
        while (level > 5 || level < 0) {
            System.out.println("Choisissez un niveau (1-5), 0 pour quitter: ");
            String selectedLevel = sc.nextLine();
            try {
                level = Integer.parseInt(selectedLevel);
                if (level > 5 || level < 0) {
                    System.out.println(ColoredConsoleText.RED + "Invalid level" + ColoredConsoleText.RESET);
                } else {
                    return level;
                }
            } catch (NumberFormatException e) {
                System.out.println(ColoredConsoleText.RED + "Invalid level" + ColoredConsoleText.RESET);
            }
        }
        return level;
    }
}
