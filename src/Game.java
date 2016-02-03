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

        String numStr = scanner.nextLine();
        int numInt = Interger.valueOf(numStr);
    }
}
