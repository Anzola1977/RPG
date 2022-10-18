public class GiantSnake extends Monster {

    public static String scream = "Ssssssssss ";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 7);
    }

    @Override
    public void attack() {
        growl(true);
        super.attack();
        System.out.println("     ...and hid in the grass");
    }

    @Override
    public void growl() {
        System.out.println(scream);
        super.growl();
    }

    public void growl(boolean loud) {
        if (!loud) {
            super.growl();
        } else {
            System.out.println(scream.toUpperCase() + super.name + " growled");
        }
    }
}