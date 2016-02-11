import java.util.ArrayList;

/**
 * Created by MacLap on 2/3/16.
 */
public class Player extends Character {

    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    public Player() {
        this.health = 20;
        this.damage = 20;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void chooseName() {
        System.out.println("What is your name?");

        name = Game.nextLine();
        System.out.printf("%s? What a strange name.\n", name);
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon, warrior [sword/mace]");
        weapon = Game.nextLine();

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
        System.out.println("Choose your path! [forest/tunnel]");
        location = Game.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("You find yourself surrounded by trees as you enter the forest...");
            location = "forest";
        }

        else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("You find yourself in a dark cave as you enter the tunnel...");
            location = "tunnel";
        }

        else{
            throw new Exception("Invalid location. Try again.");
        }
    }

    public void findItem(String item){
        System.out.printf("You found a %s! Pick it up? [y/n]\n", item);
        String answer = Game.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.printf("You pick up the %s\n", item);
        }
    }
}
