public class Zombie extends Monster {

    public static String scream = "Raaaauuughhhh ";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    /*public void growl(boolean loud) {
        if (!loud) {
            System.out.print(scream);
            super.growl();
        } else {
            System.out.println(scream.toUpperCase() + getName() + " growled");

        }
    }*/
}
