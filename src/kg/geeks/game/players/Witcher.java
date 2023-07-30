package kg.geeks.game.players;

public class Witcher extends Hero {

    private boolean hasRevive;

    public Witcher(int health, int attack, String name) {
        super(health, attack, SuperAbility.MAKES_ALIVE, name);
        this.hasRevive = true;
    }


    public void uniqueAbility(Hero[] heroes, Boss boss) {
        if (hasRevive) {
            for (Hero hero : heroes) {
                if (!hero.isAlive()) {
                    System.out.println(name + " оживляет " + hero.getName() + ", отдавая свою жизнь.");
                    this.health = 0;
                    this.isAlive = false;
                    hasRevive = false;
                    break;
                }
            }
        }
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}

