package kg.geeks.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private SuperAbility ability;
    public Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
        this.isAlive = true;
    }

    public SuperAbility getAbility(){
        return ability;
    }

    public void attack(Boss boss){
        boss.setHealth(boss.getHealth() - this.getDamage());
    }
    protected String name;
    protected int health;
    protected int attack;
    protected boolean isAlive;
    protected boolean isAlive() {
        return false;
    }
    }







