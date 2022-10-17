public class Zombie extends Monster {

    public static String scream = "Raaaauuughhhh ";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void attack() {
        super.attack();
    }

    public void growl(boolean sound) {
        if (!sound) {
            super.growl();
        } else if (sound) {
            System.out.println(scream.toUpperCase() + super.name + " growled");

        }
    }
}
