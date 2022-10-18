public class Main {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Alice");
        zombie1.growl();
        zombie1.growl(true);
        zombie1.growl(false);
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();
    }
}