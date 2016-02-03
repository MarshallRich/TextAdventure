/**
 * Created by MacLap on 2/3/16.
 */
public class Player {
    String name;
    String weapon;
    String location;

    public void chooseName() {
        System.out.println("What is your name?");

        name = Game.scanner.nextLine();
        System.out.println(name + "? What a strange name.");
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon, warrior [sword/mace]");
        weapon = Game.scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("A sword is a fine weapon.");
        }

        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("A mace is a practical choice.");
        }

        else {
            throw new Exception("Invalid weapon! Try again.");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your path [forest/tunnel]");
        location = Game.scanner.nextLine();

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
