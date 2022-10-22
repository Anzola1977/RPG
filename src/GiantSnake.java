public class GiantSnake extends Monster implements Fighter{

    public static String scream = "Ssssssssss ";

    boolean isPoisonous;

    public GiantSnake(String name, boolean isPoisonous) {
        super(name + " the GiantSnake", 7);
        this.isPoisonous = isPoisonous;
    }
    public void growl() {
        System.out.println(scream);
    }

    @Override
    public void attack(Entity entity) {
        entity.damage(getForce());
        growl();
    }
}