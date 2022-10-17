public class Monster {
    public String name;

    public int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }

    public void attack() {
        System.out.println("Monster " + name + " attacked with damage " + damage);
    }

    public void growl() {
        System.out.println(Zombie.scream + name + " growled");
    }
}
