public class Bard extends Character
{
     Weapon weapon;
     int mana;

    public Bard(String name, int money, int attack, Weapon weapon, int mana) {
        super(name, money, attack);
        this.weapon = weapon;
        this.mana = mana;
    }

    //getters
    public Weapon getWeapon() {
        return weapon;
    }

    public int getMana() {
        return mana;
    }

    //setters

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        String output = super.toString() +
                "\nWeapon: " + weapon +
                "\nMana: " + mana;
        return output;
    }

}
