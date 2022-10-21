public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Zombie zombie = new Zombie("Alice");
        Zombie zombie1 = new Zombie("Bob");
        Zombie zombie2 = new Zombie("Eve");
        GiantSnake snake = new GiantSnake("Kaa", 20, 7);
        GiantSnake snake1 = new GiantSnake("Son of Kaa", 15,5);
        //zombie1.growl();
        //zombie1.growl(true);
        //zombie1.growl(false);
        Battle battle = new Battle();
        battle.add(zombie);
        battle.add(zombie1);
        battle.add(zombie2);
        battle.add(snake);
        battle.add(snake1);
        //zombie.attack(zombie);


        //battle.add(new Zombie("Noname"));
        //battle.add(new GiantSnake("Noname"));


        battle.run(monster);
    }
}