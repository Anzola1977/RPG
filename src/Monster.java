public class Monster {
    public String name;
    public int hp;

    public int force;
    public boolean destroyed = false;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
        System.out.println("Monster " + name + " was created");
    }

    public Monster() {
    }

    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }

    public void attack(Monster monster) {
        monster.damage(getForce());
    }

    protected boolean damage(int force) {
        hp -= force;
        if (hp <= 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }
    public boolean isDestroyed() {
        return destroyed;
    }
    public void growl() {
        System.out.println(name + " growled");
    }
}
