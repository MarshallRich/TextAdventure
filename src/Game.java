import java.util.Scanner;

/**
 * Created by MacLap on 2/3/16.
 */
public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, traveller.");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + "? What a strange name.");

        System.out.println("Choose your weapon, warrior [sword/mace]");
        String weapon = scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("A sword is a fine weapon.");
        }

        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("A mace is a practical choice.");
        }

        else {
            throw new Exception("Invalid weapon! Try again.");
        }

        System.out.println("Choose your path [forest/tunnel]");
        String location = scanner.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("You find yourself surrounded by trees as you enter the forest...");
        }

        else if (location.equalsIgnoreCase("tunnels")) {
            System.out.println("You find yourself in a dark cave as you enter the tunnel...");
        }

        else{
            throw new Exception("Invalid location. Try again.");
        }
    }
}
