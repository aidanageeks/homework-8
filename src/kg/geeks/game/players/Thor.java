package kg.geeks.game.players;
import java.util.Random;

public class Thor extends Hero {
    private static final double STUN_CHANCE = 0.3; // 30% шанс оглушения

    public Thor(int health, int attack, String name) {
        super(health, attack, SuperAbility.STUN, name );
    }

    public void uniqueAbility(Hero[] heroes, Boss boss) {
        if (Math.random() <= STUN_CHANCE) {
            boss.stun();
            System.out.println(name + " оглушает босса на 1 раунд.");
        }
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}

