package kg.geeks.game.players;

public class Magic extends Hero{
    public Magic(int health, int damage, String name){
        super(health, damage, SuperAbility.BOOST, name);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
    }
        public class Magic1 {
            private int bonusAttack;

            public void Magic(int bonusAttack) {
                this.bonusAttack = bonusAttack;
            }

            public void applyMagic(Hero[] heroes) {
                for (Hero hero : heroes) {
                    hero.attack += bonusAttack;
                }
            }
        }


    }

