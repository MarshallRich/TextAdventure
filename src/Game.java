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

        player.findItem("shield");}

    public static String nextLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")){
            System.out.println("You ran a command!");
            line =scanner.nextLine();
        }
        return line;

    }

}

