public class Monster {
    final private String name;

    final private int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }

    public void attack() {
        System.out.println("Monster " + name + " attacked with damage " + damage);
    }

    public void growl() {
        System.out.println(name + " growled");
    }
}
