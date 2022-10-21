public class GiantSnake extends Monster {

    public static String scream = "Ssssssssss ";

    public GiantSnake(String name, int hp, int force) {
        super(name, hp);
    }

/*

    @Override
    public void growl() {
        System.out.println(scream);
        super.growl();
    }

    /*public void growl(boolean loud) {
        if (!loud) {
            super.growl();
        } else {
            System.out.println(scream.toUpperCase() + getName() + " growled");
        }
    }*/
}