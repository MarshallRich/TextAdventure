import java.util.Scanner;

/**
 * Created by MacLap on 2/3/16.
 */
public class Game {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller.");

        Player player = new Player();

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();

        System.out.println("You found a shield! Pick it up? [y/n]");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            player.items.add("shield");
        }
    }
}
